package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//	Uses explicit bean id annotation

@Component("footballerLomo")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Take 1000 penalty kicks today.";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	
	

}
