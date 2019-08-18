package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
By Login=By.xpath("//span[contains(text(),'Login')]");
By Text= By.xpath("//img[@class='img-responsive logo']");
By Msg=By.xpath("//h2[contains(text(),'Featured Courses')]");
By Home= By.xpath("//a[contains(text(),'Home')]");
  public Landingpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  
	  this.driver=driver;
}


public  WebElement Login() {
	  
	return  driver.findElement(Login);
  }

public  WebElement Text() {
	  
	return  driver.findElement(Text);
  }

public  WebElement Msg() {
	  
	return  driver.findElement(Msg);
	
  }
  public WebElement gethome() {
	  
	return  driver.findElement(Home);
  }
  

}
  




