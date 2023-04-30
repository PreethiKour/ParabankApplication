package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.AccountOverviewPage;
import com.para.pages.LoginPage;

public class AccountOverviewTest {

LoginPage loginpage;
AccountOverviewPage accountoverviewpage;


	
	@BeforeMethod
	public void browserConfig()
	{
		LoginPage loginpage =new LoginPage();
		loginpage.initialization();
			
	}

	@Test
	public void accountOverview()
	{
		loginpage.login();
		accountoverviewpage.accountOverview();
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		loginpage.tearDown();
	}
	}













