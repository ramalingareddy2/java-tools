package com.leawy.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "debug")
public class DebugPlugin extends AbstractMojo {
	@Parameter(property = "message", required = true)
	private String message;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		super.getLog().info("Hurray! maven plugin is working!");
	}

}
