package com.para.tests;

import org.testng.annotations.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.para.pages.AccountCreationPage;
import com.para.pages.LoginPage;


public class AccountCreationTest {


LoginPage loginpage;
AccountCreationPage page;



@BeforeMethod
public void browserConfig()
{
	loginpage=new LoginPage();
	loginpage.initialization();
		
}

@Test
public void openAccount()

{
	loginpage.login();
	page.openNewAccount();
}


@AfterMethod
public void closeBrowser()
{
	loginpage.tearDown();
}
}




