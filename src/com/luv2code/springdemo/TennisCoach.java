package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Uses default bean id implementation

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("textFileFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("Inside default constructor");
	}
	
	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside the doMyStartupStuff method");
	}
	
	
	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside the doMyCleanupStuff method");
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice your forehand strokes for 2hrs daily!";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, IOException {
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
