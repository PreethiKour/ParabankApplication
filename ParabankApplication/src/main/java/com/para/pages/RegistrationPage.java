package com.para.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.parabank.base.BaseClass;

public class RegistrationPage extends BaseClass {


By RegisterLink = By.linkText(prop.getProperty("RegisterLink"));
By Firstname = By.name(prop.getProperty("Firstname"));
By Lastname = By.name(prop.getProperty("Lastname"));
By address = By.name(prop.getProperty("address"));
By City = By.name(prop.getProperty("City"));
By State = By.name(prop.getProperty("State"));
By zipcode = By.name(prop.getProperty("zipcode"));
By PhoneNumber = By.name(prop.getProperty("PhoneNumber"));
By ssn = By.name(prop.getProperty("ssn"));
By Username = By.name(prop.getProperty("Username"));
By Password = By.name(prop.getProperty("Password"));
By ConfirmPassword = By.name(prop.getProperty("ConfirmPassword"));
By registerButton = By.xpath(prop.getProperty("registerButton"));


public void clickRegisterLink()
{
	driver.findElement(RegisterLink).click();
	
}

public void enterFirstName(String firstname)
{
	WebElement firstnamefield = driver.findElement(Firstname);
	firstnamefield.sendKeys(prop.getProperty(firstname));
}

public void enterLastName(String lastname)
{
	WebElement lastnamefield = driver.findElement(Lastname);
	lastnamefield.sendKeys(prop.getProperty(lastname));
}


public void enterAddress(String Address)
{
	WebElement addressfield = driver.findElement(address);
	addressfield.sendKeys(prop.getProperty(Address));
}

public void enterCity(String city)
{
	WebElement cityfield = driver.findElement(City);
	cityfield.sendKeys(prop.getProperty(city));
}

public void enterState(String state)
{
	WebElement statefield = driver.findElement(State);
	statefield.sendKeys(prop.getProperty(state));
}

public void enterZip(String Zipcode)
{
	WebElement zipcodefield = driver.findElement(zipcode);
	zipcodefield.sendKeys(prop.getProperty(Zipcode));
}


public void enterPhoneNumber(String phonenumber)
{
	WebElement phonenumberfield = driver.findElement(PhoneNumber);
	phonenumberfield.sendKeys(prop.getProperty(phonenumber));
}

public void enterSSN(String SSN)
{
	WebElement SSNfield = driver.findElement(ssn);
	SSNfield.sendKeys(prop.getProperty(SSN));
}

public void enterUsername(String username)
{
	WebElement usernamefield = driver.findElement(Username);
	usernamefield.sendKeys(prop.getProperty(username));
}

public void enterPassword(String password)
{
	WebElement passwordfield = driver.findElement(Password);
	passwordfield.sendKeys(prop.getProperty(password));
}

public void confirmPassword(String confirmpassword)
{
	WebElement confirmpasswordfield = driver.findElement(ConfirmPassword);
	confirmpasswordfield.sendKeys(prop.getProperty(confirmpassword));
}

public void clickRegisterButton() {
	WebElement RegsiterBtn = driver.findElement(registerButton);
	RegsiterBtn.click();
}




}


