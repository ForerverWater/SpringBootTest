package com.water.ch3.condition;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		// TODO Auto-generated method stub
		return "ls";
	}

}
