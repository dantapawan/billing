package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
By Login=By.xpath("//div[@class='listbuilder-popup-content']");


  public Landingpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  
	  this.driver=driver;
}


public  WebElement Login() {
	  
	return  driver.findElement(Login);
  }
}
