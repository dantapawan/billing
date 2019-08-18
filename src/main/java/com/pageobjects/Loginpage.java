package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	
By Email=By.xpath("//input[@type='email']");

By Password = By.cssSelector("#user_password");
By Login= By.xpath("//input[@value='Log In']");
  public Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  
	  this.driver=driver;
}

  public  WebElement getemail() {
	  
	return  driver.findElement(Email);
  }
  
  public  WebElement getPassword() {
	  
		return  driver.findElement(Password);
}
  
  public  WebElement getLogin() {
	  
		return  driver.findElement(Login);
  
}
}
