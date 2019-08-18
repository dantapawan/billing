package com.academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Baseclass {

	
  
public static WebDriver driver;
   
  // String driverpath = "C:\\webdriver\\chromedriver.exe";
   
   public Properties prop;
   
   @Test
   
   public WebDriver initializeDriver () throws IOException {
	   
	    prop = new Properties();
	   
	   FileInputStream fis = new FileInputStream("C:\\apps\\billing\\src\\main\\java\\com\\academy\\data.properties");
	   
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
	
   return driver;
}
   public void getScreenshot(String result) throws IOException {
	   
	File src  =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
    FileUtils.copyFile(src, new File("C://Users//screenshot.png"));
    
    
   }

}

