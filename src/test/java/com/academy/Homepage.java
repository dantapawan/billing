package com.academy;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Landingpage;
import com.pageobjects.Loginpage;



public class Homepage extends Baseclass{
	
	Logger logger = Logger.getLogger(Homepage.class);

	
	
	@BeforeTest
	public void intialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("Url"));	
	}
	@Test(dataProvider="getdata")
	public void accessthehomepage(String username,String password) throws IOException  {
		driver.get(prop.getProperty("Url"));
		logger.info("url " + prop.getProperty("Url"));
		Landingpage lp= new Landingpage(driver);
		lp.Login().click();
		Loginpage log= new Loginpage(driver);
		log.getemail().sendKeys(username);
		log.getPassword().sendKeys(password);
		log.getLogin().click();
	}
	//@Test
	public void tossu() {
		
		driver.get("http://www.qaclickacademy.com/");
		Landingpage lp= new Landingpage(driver);
		lp.Login().click();
	}
	
	//@Test
	public void tanvi() {
		
	
	
}
	@DataProvider(name="getdata")
		
		public Object[][] getdataprovider(){
			return new Object[][] {
				
				{"santhi@gmail.com","123toss"},
				
				{"rishi@gmail.com","123rish"},
			
				{"pawan@gmail.com","123pawn"},
		};
		
		}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver= null;
	}
	

}