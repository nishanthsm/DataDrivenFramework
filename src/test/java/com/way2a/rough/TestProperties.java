package com.way2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties OR = new  Properties();
		FileInputStream fis = new FileInputStream("E:\\EEEEEEE\\DataDrivenFramework\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		
		fis = new FileInputStream("E:\\EEEEEEE\\DataDrivenFramework\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		System.out.println(OR.getProperty("bmlBtn"));
		
	}

}
