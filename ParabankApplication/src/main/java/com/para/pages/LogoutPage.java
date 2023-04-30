package com.para.pages;

import org.openqa.selenium.By;

import com.parabank.base.BaseClass;

public class LogoutPage extends BaseClass {



By logout = By.linkText(prop.getProperty("logout"));


public void logout()
{
	driver.findElement(logout).click();
}

}
