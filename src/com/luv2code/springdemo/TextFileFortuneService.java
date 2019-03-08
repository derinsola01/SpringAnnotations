package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TextFileFortuneService implements FortuneService {

	@Override
	public String getFortune() throws IOException{
		ArrayList<String> fortuneList = readTextFile(); //new ArrayList<String>();
		
		return getRandomFortune(fortuneList);
	}
	
	public String getRandomFortune( ArrayList<String> fortuneArray ) {
		Random randomInteger = new Random();
		int randomIndex = randomInteger.nextInt(fortuneArray.size());
		return fortuneArray.get(randomIndex);
	}
	
	public ArrayList<String> readTextFile () throws IOException{
		File textReader = new File("/Users/derin/Development/Java Projects/spring-demo-annotations/src/dailyFortune.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(textReader)); 
		ArrayList<String> arrayLoader = new ArrayList<String>();
		while (bufferedReader.readLine() != null)
			arrayLoader.add(bufferedReader.readLine());
		bufferedReader.close();
		return arrayLoader;
	}
	
	@PostConstruct
	public void doInitStuff() throws IOException {
		System.out.println("Inside the doInitStuff method");
		System.out.println("Print Random Fortune: " + getFortune());
		System.out.println("Last line inside the doInitStuff method");
	}
	
	@PreDestroy
	public void doDestroyStuff() {
		System.out.println("Inside the doDestroyStuff method");
	}

}