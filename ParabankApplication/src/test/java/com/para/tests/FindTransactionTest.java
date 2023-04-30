package com.para.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.para.pages.LoginPage;
import com.para.pages.TransactionPage;

public class FindTransactionTest {


LoginPage loginpage;
TransactionPage transactionpage;


@BeforeMethod
public void configBrowser()
{
	loginpage = new LoginPage();
	loginpage.initialization();
}

@Test
public void findTransaction()
{
	loginpage.login();
	transactionpage.findTransactions();
	
}

@Test
public void FindTransactionID()
{
	loginpage.login();
	transactionpage.findByTransactionID();
}

@Test
public void findTransactionByDate()
{
	loginpage.login();
	transactionpage.findByDate();
}

@Test
public void findTransactionByDateRange()
{
	loginpage.login();
	transactionpage.findByDateRange();
}

@Test
public void findTransactionByAmount()
{
	loginpage.login();
	transactionpage.findByAmount();
}

@AfterMethod
public void closeBrowser()
{
	loginpage.tearDown();
}


}
