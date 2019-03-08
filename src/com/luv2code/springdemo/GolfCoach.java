package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice variety of swing shots and hit the hole 250 yards out!";
	}

	@Override
	public String getDailyFortune() throws FileNotFoundException, IOException {
		return fortuneService.getFortune();
	}

}
