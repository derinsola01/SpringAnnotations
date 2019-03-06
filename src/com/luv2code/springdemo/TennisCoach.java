package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// Specified bean id
//@Component("thatSillyCoach")

// default bean id
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Practice your forehand strokes for 2hrs daily!";
	}

}
