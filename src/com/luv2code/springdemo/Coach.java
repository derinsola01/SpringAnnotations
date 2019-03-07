package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Coach {
	
	public String getDailyWorkOut();
	public String getDailyFortune() throws FileNotFoundException, IOException;

}
