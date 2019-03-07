package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FortuneService {
	
	public String getFortune() throws FileNotFoundException, IOException;

}
