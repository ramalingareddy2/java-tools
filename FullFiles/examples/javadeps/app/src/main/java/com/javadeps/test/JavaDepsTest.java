package com.javadeps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadeps.bean.Rocket;
import com.javadeps.config.JavaConfig;

public class JavaDepsTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Rocket rocket = context.getBean(Rocket.class);
		rocket.launch();
	}
}
