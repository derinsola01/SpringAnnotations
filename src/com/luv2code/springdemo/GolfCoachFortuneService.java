package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GolfCoachFortuneService implements FortuneService {

	@Override
	public String getFortune() throws FileNotFoundException, IOException {
		return "This is supposed to return an hardcoded sentence or something...";
	}

}
