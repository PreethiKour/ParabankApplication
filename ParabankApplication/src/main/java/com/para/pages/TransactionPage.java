package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.BaseClass;

public class TransactionPage extends BaseClass {


By FindTransaction = By.linkText(prop.getProperty("FindTransaction"));
By account = By.id(prop.getProperty("account"));
By TransactionID = By.id(prop.getProperty("TransactionID"));
By TransactionIDBtn = By.xpath(prop.getProperty("TransactionIDBtn"));
By FindByDate = By.id(prop.getProperty("FindByDate"));
By TransactionDateBtn = By.xpath(prop.getProperty("TransactionDateBtn"));
By fromDate = By.id(prop.getProperty("fromDate"));
By ToDate = By.id(prop.getProperty("ToDate"));
By TransctionDateRangeBtn = By.xpath(prop.getProperty("TransctionDateRangeBtn"));
By amount = By.id(prop.getProperty("amount"));
By TransactionamountBtn = By.xpath(prop.getProperty("TransactionamountBtn"));

public void findTransactions()
{
	driver.findElement(FindTransaction).click();
	Select fromAccountselect = new Select(driver.findElement(account));
	fromAccountselect.selectByVisibleText("account");
}


public void findByTransactionID()
{
	try
	{
	driver.findElement(FindTransaction).click();
	driver.findElement(TransactionID).sendKeys(prop.getProperty("TransactionByID"));
	driver.findElement(TransactionIDBtn).click();
	Thread.sleep(3000);
   }catch(InterruptedException e) {
	    e.printStackTrace();
	    
   }

}

public void findByDate()
{
	try
	{
	driver.findElement(FindTransaction).click();
	driver.findElement(FindByDate).sendKeys(prop.getProperty("FindDate"));
	driver.findElement(TransactionDateBtn).click();
	Thread.sleep(3000);
}catch(InterruptedException e) {
    e.printStackTrace();

}

}

public void findByDateRange()
{
	try
	{
	
	driver.findElement(FindTransaction).click();
	driver.findElement(fromDate).sendKeys(prop.getProperty("frombyDate"));
	driver.findElement(ToDate).sendKeys(prop.getProperty("TobyDate"));
	driver.findElement(TransctionDateRangeBtn).click();
	Thread.sleep(3000);
	
}catch(InterruptedException e) {
    e.printStackTrace();

}

}

public void findByAmount()
{
	try
	{
	
	driver.findElement(FindTransaction).click();
		driver.findElement(amount).sendKeys(prop.getProperty("Amount"));
		driver.findElement(TransactionamountBtn).click();
		Thread.sleep(3000);
	}catch(InterruptedException e) {
	    e.printStackTrace();
	}
}





}

