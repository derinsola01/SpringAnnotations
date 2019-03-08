package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// read spring config file specified bean id
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// default bean id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// explicit bean id
		Coach footieCoach = context.getBean("footballerLomo", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(footieCoach.getDailyWorkOut());
		
		context.close();

	}

}
