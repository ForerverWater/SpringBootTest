package com.water.ch3.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService ls = context.getBean(ListService.class);
		System.out.println("命令列表为:" + ls.showListCmd());
		//System.out.println(context.getEnvironment().getProperty("os.name").contains("Windows"));
		context.close();
	}
}
