package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import com.parabank.base.BaseClass;

public class BillPayPage extends BaseClass {


	By billPay = By.linkText(prop.getProperty("billPay"));
	By payeename = By.name(prop.getProperty("payeename"));
	By address = By.name(prop.getProperty("address"));
	By city = By.name(prop.getProperty("city"));
	By state = By.name(prop.getProperty("state"));
	By zipcode = By.name(prop.getProperty("zipcode"));
	By phonenumber = By.name(prop.getProperty("phonenumber"));
	By accountnumber = By.name(prop.getProperty("accountnumber"));
	By verifyaccount = By.name(prop.getProperty("verifyaccount"));
	By amount = By.name(prop.getProperty("amount"));
	By fromAccount = By.name(prop.getProperty("fromAccount"));
	By paymentBtn = By.xpath(prop.getProperty("paymentBtn"));
	
	
	public void payBill()
	{
		try {
		
		driver.findElement(billPay).click();
		driver.findElement(payeename).sendKeys(prop.getProperty("payneeName"));
		driver.findElement(address).sendKeys(prop.getProperty("Address"));
		driver.findElement(city).sendKeys(prop.getProperty("City"));
		driver.findElement(state).sendKeys(prop.getProperty("State"));
		driver.findElement(zipcode).sendKeys(prop.getProperty("Zipcode"));
		driver.findElement(phonenumber).sendKeys(prop.getProperty("PhoneNumber"));
		driver.findElement(accountnumber).sendKeys(prop.getProperty("AccountNumber"));
		driver.findElement(verifyaccount).sendKeys(prop.getProperty("VerifyAccountNumber"));
		driver.findElement(amount).sendKeys(prop.getProperty("Amount"));
		Select fromAccountselect = new Select(driver.findElement(fromAccount));
		fromAccountselect.selectByVisibleText("fromAccount");
		driver.findElement(paymentBtn).click();
		Thread.sleep(2000);
		}catch (InterruptedException e) {
		    e.printStackTrace();
		
	}
	
	























}
