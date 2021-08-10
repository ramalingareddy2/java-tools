package com.leawy.plugins;

import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "email")
public class EmailPlugin extends AbstractMojo {
	@Parameter(property = "smtphost", required = true, defaultValue = "none")
	private String smtpHost;
	@Parameter(property = "smtpport", required = true, defaultValue = "none")
	private String smtpPort;
	@Parameter(property = "smtpuser", required = true, defaultValue = "none")
	private String username;
	@Parameter(property = "smtppassword", required = true, defaultValue = "none")
	private String password;
	@Parameter(property = "toaddress", required = true, defaultValue = "none")
	private String toEmailAddress;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		Properties props = null;

		Map map = super.getPluginContext();
		map.forEach((k, v) -> {
			getLog().info(k + " : " + v);
		});

		props = new Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", smtpPort);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.trust", smtpHost);

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom("noreply@s-force.org");
			message.setRecipients(RecipientType.TO, toEmailAddress);
			message.setSubject("build success");
			message.setText("You maven build is successful");
			Transport.send(message);
		} catch (MessagingException e) {
			throw new MojoExecutionException("error while sending email", e);
		}
	}
}
