package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file specified bean id
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// default bean id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// explicit bean id
		Coach footieCoach = context.getBean("footballerLomo", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(footieCoach.getDailyWorkOut());
		
		context.close();

	}

}
