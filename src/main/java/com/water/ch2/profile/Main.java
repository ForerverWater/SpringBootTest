package com.water.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demobean = context.getBean(DemoBean.class);
		System.out.println(demobean.getContent());
		context.close();
	}
}
