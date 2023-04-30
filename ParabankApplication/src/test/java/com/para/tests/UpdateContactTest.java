package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.UpdateContactPage;

public class UpdateContactTest {


	LoginPage loginpage;
	UpdateContactPage updateContactpage;
	
	@BeforeMethod
	public void browserConfig()
	{
		LoginPage loginpage =new LoginPage();
		loginpage.initialization();
		
	}	

@Test
public void updateContactInfo()
{
	loginpage.login();
	updateContactpage.updateContact();
}

@Test
public void getFirstName()
{
	loginpage.login();
	updateContactpage.enterFirstName();
	
}

@Test
public void getLastName()
{
	loginpage.login();
	updateContactpage.enterLastName();
}

@Test
public void getAddress()
{
	loginpage.login();
	updateContactpage.enterAddress();
}

@Test
public void getCity()
{
	loginpage.login();
	updateContactpage.enterCity();
	
}

@Test
public void getState()
{
	loginpage.login();
	updateContactpage.enterState();
	
}

@Test
public void getZipcode()
{
	loginpage.login();
	updateContactpage.enterZipcode();
	
}

@Test
public void getPhoneNumber()
{
	loginpage.login();
	updateContactpage.enterPhoneNumber();
	
}

@Test
public void ClickUpdate()
{
	loginpage.login();
	updateContactpage.clickUpdateBtn();
	
}

@AfterMethod
public void closeBrowser()
{
	loginpage.tearDown();
}


}
