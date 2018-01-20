package com.water.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)//每个5秒执行
	public void reportCurrentTime() {
		System.out.println("每个五秒执行一次" + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 53 22 ? * *")//每天11点28分执行
	public void fixTimeExecution() {
		System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
	}
}
