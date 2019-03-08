package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// read spring config file specified bean id
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// default bean id
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// print results
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email is: " + theCoach.getEmail());
		System.out.println("Team is: " + theCoach.getTeam());
		
		context.close();

	}

}
