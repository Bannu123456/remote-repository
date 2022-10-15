package com.seleniumframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {
	
	@FindBy(xpath="//input[@aria-label='Email or Phone']")  
	WebElement uname;
	
	@FindBy(xpath="//input[@aria-label='Password']")  
	WebElement pwd;
	
	@FindBy(xpath="//button[@aria-label='Sign in']")  
	WebElement login;
	
	

	public void login(String username, String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}
	

}
