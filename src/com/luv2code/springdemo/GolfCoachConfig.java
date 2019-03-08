package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolfCoachConfig {
	
	// define bean for fortune service
		@Bean
		public FortuneService golfFortuneService() {
			return new GolfCoachFortuneService();
		}
			
		// define bean for our golf coach and inject dependency
		@Bean
		public Coach golfCoach() {
			return new GolfCoach(golfFortuneService());
		}

}
