package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Uses default bean id implementation

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice your forehand strokes for 2hrs daily!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
