package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.RegistrationPage;
import com.parabank.base.BaseClass;

public class RegisterTest extends BaseClass {

LoginPage loginpage;
RegistrationPage Rpage;

@BeforeMethod
public void browserConfig()
{
	loginpage = new LoginPage();
	loginpage.login();
}

@Test
public void registerTest()
{
	loginpage.login();
	Rpage.clickRegisterLink();
}

@Test
public void getFirstName()
{
	
	loginpage.login();
	Rpage.enterFirstName("firstname");
	
}

@Test
public void getLastName()
{
	loginpage.login();
	Rpage.enterLastName("lastname");
	
}

@Test
public void getAddress()
{
	loginpage.login();
	Rpage.enterAddress("Address");
	
}

@Test
public void getCity()
{
	loginpage.login();
	Rpage.enterCity("city");
	
}

@Test
public void getState()
{
	loginpage.login();
	Rpage.enterState("state");
}

@Test
public void getZip()
{
	loginpage.login();
	Rpage.enterZip("Zipcode");
}

@Test
public void getSSN()
{
	loginpage.login();
	Rpage.enterSSN("SSN");
}

@Test
public void getPhonenumber()
{
	loginpage.login();
	Rpage.enterPhoneNumber("phonenumber");
}

@Test
public void getUsername()
{
	loginpage.login();
	Rpage.enterUsername("username");
}

@Test
public void getPassword()
{
	loginpage.login();
	Rpage.enterPassword("password");
}

@Test
public void getConfirmPassword()
{
	loginpage.login();
	Rpage.confirmPassword("confirmpassword");
}

@Test
public void registerButton()
{
	loginpage.login();
	Rpage.clickRegisterButton();
}

@AfterMethod
public void tearDown()
{
	loginpage.tearDown();
}

}


