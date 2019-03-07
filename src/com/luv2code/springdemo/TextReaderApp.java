package com.luv2code.springdemo;

import java.io.IOException;

public class TextReaderApp {

	public static void main(String[] args) throws IOException {
		TextFileFortuneService textFileFortuneService = new TextFileFortuneService();
		System.out.println("Reading fortune from file: ");
		System.out.println("\t " + textFileFortuneService.getFortune());
	}

}
