package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.parabank.base.BaseClass;

public class UpdateContactPage extends BaseClass {

By contactInfo = By.linkText(prop.getProperty("contactInfo"));
By FirstName = By.id(prop.getProperty("FirstName"));
By LastName = By.id(prop.getProperty("LastName"));
By Address = By.id(prop.getProperty("Address"));
By City = By.id(prop.getProperty("City"));
By State = By.id(prop.getProperty("State"));
By Zipcode = By.id(prop.getProperty("Zipcode"));
By PhoneNumber = By.id(prop.getProperty("PhoneNumber"));
By updateBtn = By.xpath(prop.getProperty("updateBtn"));

public void updateContact()
{
	driver.findElement(contactInfo).click();
}

public void enterFirstName()
{
	WebElement FirstnameField = driver.findElement(FirstName);
	FirstnameField.clear();
	FirstnameField.sendKeys(prop.getProperty("firstname"));
}


public void enterLastName()
{
	WebElement LastnameField = driver.findElement(LastName);
	LastnameField.clear();
	LastnameField.sendKeys(prop.getProperty("lastname"));
}

public void enterAddress()
{
	WebElement AddressField = driver.findElement(Address);
	AddressField.clear();
	AddressField.sendKeys(prop.getProperty("address"));
}

public void enterCity()
{
	WebElement CityField = driver.findElement(City);
	CityField.clear();
	CityField.sendKeys(prop.getProperty("city"));
}

public void enterState()
{
	WebElement StateField = driver.findElement(State);
	StateField.clear();
	StateField.sendKeys(prop.getProperty("state"));
}

public void enterZipcode()
{
	WebElement ZipcodeField = driver.findElement(Zipcode);
	ZipcodeField.clear();
	ZipcodeField.sendKeys(prop.getProperty("zipcode"));
}

public void enterPhoneNumber()
{
	WebElement phnNumber = driver.findElement(PhoneNumber);
	phnNumber.clear();
	phnNumber.sendKeys(prop.getProperty("phonenumber"));
}

public void clickUpdateBtn()
{
	driver.findElement(updateBtn).click();
	
}






}
