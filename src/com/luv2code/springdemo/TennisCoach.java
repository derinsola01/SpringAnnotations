package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// Uses default bean id implementation

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Practice your forehand strokes for 2hrs daily!";
	}

}
