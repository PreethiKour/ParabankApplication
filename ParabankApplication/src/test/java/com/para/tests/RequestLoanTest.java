package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.RequestLoanPage;

public class RequestLoanTest {

	LoginPage loginpage;
	RequestLoanPage requestloan;
	
@BeforeMethod
public void configBrowser()
{
		loginpage = new LoginPage();
		loginpage.initialization();
}

@Test
public void requestForLoan()
{
	loginpage.login();
	requestloan.requestLoan();
}

@AfterMethod
public void closeBrowser()
{
	loginpage.tearDown();
}

}
