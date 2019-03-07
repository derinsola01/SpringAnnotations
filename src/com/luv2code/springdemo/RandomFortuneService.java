package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward",
			"You're destined for great things",
			"Fortune favors the bold",
			"Hope for the best, prepare for the worst",
			"It's gonna be a great day!"
	};
	
	// random number generator
	private Random randomInteger = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int randomIndex = randomInteger.nextInt(data.length);
		return data[randomIndex];
	}

}
