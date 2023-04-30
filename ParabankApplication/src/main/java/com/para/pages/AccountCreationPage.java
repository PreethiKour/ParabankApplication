package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.BaseClass;

public class AccountCreationPage extends BaseClass {

 By openNewAccount = By.linkText(prop.getProperty("openNewAccount"));
 By accountTypeDropdown = By.name(prop.getProperty("accountTypeDropdown"));
 By typeOfAccount = By.id(prop.getProperty("typeOfAccount"));
 By accountNumberField = By.id(prop.getProperty("accountNumberField"));
 By openAccountButton = By.xpath(prop.getProperty("openAccountButton"));
 
 
 
public void openNewAccount()
{
	try {
	    driver.findElement(openNewAccount).click();
		Select typeOfAccount = new Select(driver.findElement(accountTypeDropdown));
		typeOfAccount.selectByVisibleText(prop.getProperty("typeOfAccoun"));
		driver.findElement(openAccountButton).click();
	    Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
 
	
	
}

