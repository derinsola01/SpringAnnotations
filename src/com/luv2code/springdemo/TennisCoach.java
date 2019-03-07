package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Uses default bean id implementation

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("Inside default constructor");
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice your forehand strokes for 2hrs daily!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("Inside setFortuneService Setter");
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyShit(FortuneService theFortuneService) {
//		System.out.println("Inside doSomeCrazyShit Method");
//		fortuneService = theFortuneService;
//	}

}
