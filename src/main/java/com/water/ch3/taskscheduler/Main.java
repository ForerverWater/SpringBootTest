package com.water.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		ScheduledTaskService ss = context.getBean(ScheduledTaskService.class);
	}
}
