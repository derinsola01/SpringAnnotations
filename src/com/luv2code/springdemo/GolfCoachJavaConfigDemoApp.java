package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GolfCoachJavaConfigDemoApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// read spring config file specified bean id
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GolfCoachConfig.class);
		
		// default bean id
		GolfCoach theCoach = context.getBean("golfCoach", GolfCoach.class);
		
		// print results
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		// closer the context
		context.close();

	}

}
