package com.para.pages;

import org.openqa.selenium.By;

import com.parabank.base.BaseClass;

public class LoginPage extends BaseClass {

 By username = By.name(prop.getProperty("username"));
 By password = By.name(prop.getProperty("password"));
 By loginBtn = By.xpath(prop.getProperty("loginBtn"));
 
 public void login()
 {
	 driver.findElement(username).sendKeys(prop.getProperty("username"));
	 driver.findElement(password).sendKeys(prop.getProperty("password"));
	 driver.findElement(loginBtn).click();
 }



}
