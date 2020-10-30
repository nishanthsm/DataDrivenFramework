package com.way2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.way2a.base.TestBase;



public class BankManagerLoginTest extends TestBase   {

	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		 
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),  "Login not successfull");
        
		
		log.debug("Login successfully executed");
		Reporter.log("Login successfully executed");
		
		//Assert.fail("Login failed");
		
		
		
	
}
}