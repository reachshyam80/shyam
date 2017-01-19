package com.amazon.cucumber.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="nav-link-yourAccount")
	public WebElement signInLink;
	
	@FindBy(xpath="//span[text()='Sign in']")
	public WebElement signInBtn;
	
	@FindBy(id="ap_email")
	public WebElement email;
	
	@FindBy(id="ap_password")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='nav-link-yourAccount']/span")
	public WebElement name;
}
