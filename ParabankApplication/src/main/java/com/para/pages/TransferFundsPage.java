package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.BaseClass;

public class TransferFundsPage extends BaseClass {


	By transferFunds = By.linkText(prop.getProperty("transferFunds"));
	By amount = By.id(prop.getProperty("amount"));
	By fromaccount = By.id(prop.getProperty("fromaccount"));
	By toAccount = By.id(prop.getProperty("toAccount"));
	By transferButton = By.xpath(prop.getProperty("tansferButton"));
	


public void transferFund()
{
	try
	{
	
	driver.findElement(transferFunds).click();
	driver.findElement(amount).sendKeys(prop.getProperty("amount"));
	Select fromAccountselect = new Select(driver.findElement(fromaccount));
	fromAccountselect.selectByVisibleText("fromaccount");
	Select toAccountselect = new Select(driver.findElement(toAccount));
	toAccountselect.selectByVisibleText("toAccount");
	driver.findElement(transferButton).click();
	Thread.sleep(2000);
	
}catch (InterruptedException e) {
    e.printStackTrace();

}

}

}