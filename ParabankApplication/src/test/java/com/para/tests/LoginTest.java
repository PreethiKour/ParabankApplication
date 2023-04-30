package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;


public class LoginTest {

LoginPage loginpage;
		
		@BeforeMethod
		public void browserConfig()
		{
			loginpage=new LoginPage();
			loginpage.initialization();
				
		}
		
		@Test
		public void validateLoginTest()
		{
			loginpage.login();
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			loginpage.tearDown();
		}
	}













