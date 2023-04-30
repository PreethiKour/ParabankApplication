package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.BaseClass;

public class RequestLoanPage extends BaseClass {

 By requestLoan = By.linkText(prop.getProperty("requestLoan"));
 By loanAmount = By.id(prop.getProperty("loanAmount"));
 By downPayment = By.id(prop.getProperty("downPayment"));
 By FromAccount = By.id(prop.getProperty("FromAccount"));
 By applyNow = By.xpath(prop.getProperty("applyNow"));
 
 
public void requestLoan()
{
	try
	{
	
	driver.findElement(requestLoan).click();
	WebElement loan = driver.findElement(loanAmount);
	loan.sendKeys("LoanAmountField");
	WebElement downpay = driver.findElement(downPayment);
	downpay.sendKeys("DownPaymentField");
	Select fromAccountselect = new Select(driver.findElement(FromAccount));
	fromAccountselect.selectByVisibleText("fromAccount");
	driver.findElement(applyNow).click();
	Thread.sleep(3000);
	}catch(InterruptedException e) {
	    e.printStackTrace();
}

}
}