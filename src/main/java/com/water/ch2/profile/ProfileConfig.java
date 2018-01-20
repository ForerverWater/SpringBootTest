package com.water.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean dev(){
		return new DemoBean("调用dev方法");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prod(){
		return new DemoBean("调用prod方法");
	}
}
