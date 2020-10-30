package com.way2a.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.way2a.base.TestBase;
import com.way2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName, String postCode) {
		
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys("firstName");
		driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys("lastName");
		driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys("postCode");
		driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
				
		
	}
	@DataProvider
      public Object[][] getData(){
		
		String sheetName = "AddCustomertest";
		int rows = excel.getRowCount(sheetName);
		int col = excel.getColumnCount(sheetName);
		
		Object[][]  data = new Object[rows-1][col];
		
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			
			for(int colNum=0; colNum<col; colNum++) {
				
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				
			}
			
			
		}
		return data;
		
	}
}
