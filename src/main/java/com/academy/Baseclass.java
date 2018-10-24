package com.academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Baseclass {

	
   public WebDriver driver;
   
   String driverpath = "C:\\webdriver\\chromedriver.exe";
   
   @Test
   
   public void Login() throws IOException {
	   
	   Properties prop = new Properties();
	   
	   FileInputStream fis = new FileInputStream("C:\\apps\\usbank\\src\\main\\java\\com\\academy\\data.properties");
	   
	   prop.load(fis);
	   
	String Browsername=   prop.getProperty("Browser");
	System.out.println(Browsername);
	  
	if(Browsername.equals("Firefox")) {
		
		driver= new FirefoxDriver();
	}
	else if(Browsername.equals("Chrome")) {
		
		System.setProperty("WebDriver.Chrome.driver", "driverpath");
		
		driver= new ChromeDriver();
		
	}
	else if(Browsername.equals("IE")){
		
		//driver=new IEdriver();
	}
	 System.out.println(prop.getProperty("Url"));
	 driver.get("http://www.qaclickacademy.com/");
   }
	
}
