package com.qa.DellRAM.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
  public static void main(String[] args)  {
	  File file = new File("C:\\Users\\baryons\\Documents\\wotk-temp\\DellRAM\\src\\properties");
	  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver","C:\\Users\\baryons\\Documents\\wotk-temp\\DellRAM\\src\\com\\qa\\DellRAM\\util\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(prop.getProperty("URL"));
		  driver.manage().window().maximize();

		
		
}
}