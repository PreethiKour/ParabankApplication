package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.LogoutPage;

public class LogoutTest {

LoginPage loginpage;
LogoutPage logoutpage;


@BeforeMethod
public void browserConfig()
{
	loginpage =new LoginPage();
	loginpage.initialization();
}

@Test
public void validateLogout()
{
	loginpage.login();
	logoutpage.logout();
}


@AfterMethod
public void closeBrowser()
{
	loginpage.tearDown();
}



}

