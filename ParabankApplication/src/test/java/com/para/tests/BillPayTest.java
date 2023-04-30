package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.para.pages.BillPayPage;
import com.para.pages.LoginPage;

public class BillPayTest {


	LoginPage loginpage;
	BillPayPage billpage;
	
	
	
	@BeforeMethod
	public void browserConfig()
	{
		loginpage=new LoginPage();
		loginpage.initialization();
			
	}
	
	@Test
	public void payBill()
	{
        loginpage.login();
		billpage.payBill();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		loginpage.tearDown();
	}
}






