package com.academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Landingpage;

public class Validationclass extends Baseclass{
	
	
	@BeforeTest
	public void intialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("Url"));	
	}
	
	@Test
	public void accessthehomepage() throws IOException {
		
		Landingpage lp=new Landingpage(driver);
	//Assert.assertEquals(lp.Text().getText(), "QAClickacademy");
		Assert.assertEquals(lp.Msg().getText(),"FEATURED COUSES");
		System.out.println(lp.Msg().getText());
		
WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
driver.findElement(By.xpath("//a[contains(text(),'Home')]")).isDisplayed();

if(text.getText().equalsIgnoreCase("Home")) {
	System.out.println(text.getText());
	
}
else if(text.getText().equals("Link")){
	System.out.println(text.getText());
}
Assert.assertEquals(lp.gethome().getText(),"HOME" );
		
 Assert.assertTrue(lp.gethome().isDisplayed());
 //Assert.assertFalse(false);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
}