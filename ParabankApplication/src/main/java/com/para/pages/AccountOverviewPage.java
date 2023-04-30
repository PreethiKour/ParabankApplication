package com.para.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.parabank.base.BaseClass;

public class AccountOverviewPage extends BaseClass {

 By accountoverview = By.linkText(prop.getProperty("accountoverview"));
 
 
 
 public void accountOverview()
 {
	 driver.findElement(accountoverview).click();
	 String expectedTitle = "Accounts Overview";
	 String actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
	 
 }













}
