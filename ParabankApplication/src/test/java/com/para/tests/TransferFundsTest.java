package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.TransferFundsPage;


public class TransferFundsTest {
	
	LoginPage loginpage;
	TransferFundsPage transferFundsPage;

	@BeforeMethod
	public void browserConfig()
	{
		loginpage=new LoginPage();
		loginpage.initialization();
			
	}
	
	@Test
	public void transferFunds()
	{
		loginpage.login();
		transferFundsPage.transferFund();
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		loginpage.tearDown();
	}
}














