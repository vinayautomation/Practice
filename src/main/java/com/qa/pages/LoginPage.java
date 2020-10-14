package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//h1[contains(text(),'Login')]")
	public WebElement lblLoginLogo;
	
	@FindBy(id="inputEmail")
	public WebElement edtEmail;
	
	@FindBy(id="inputPassword")
	public WebElement edtPassword;
	
	@FindBy(id="login")
	public WebElement btnLogin;
	
	@FindBy(xpath="//div[contains(@class,'recaptcha-checkbox-borderAnimation')]")
	public WebElement chkNotRobot;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
}
