package com.academy;

import org.testng.annotations.Test;

import com.pageobjects.Landingpage;

public class Homepage extends Baseclass{
	
	
	@Test
	public void accessthehomepage() {
		
		driver.get("http://www.qaclickacademy.com/");
		Landingpage lp= new Landingpage(driver);
		lp.Login().click();
	}
	@Test
	public void uhbimimumhi() {
		
		driver.get("http://www.qaclickacademy.com/");
		Landingpage lp= new Landingpage(driver);
		lp.Login().click();
	}
	
	@Test
	public void imumhi() {
	}		
}
