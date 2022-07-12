package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(.,'LOGIN PORTAL')]") public WebElement Login_Portal;
	@FindBy(xpath = "//h4[contains(.,'Login Portal')]") public WebElement Login_Portal_1;
	@FindBy(id="text") public WebElement Login_User;
	@FindBy(id="password") public WebElement Login_Password;
	@FindBy(id="login-button") public WebElement Login_Button;
	
	public void click_Login_portal()
	{
		Login_Portal_1.click();
	}
	
	public void setLoginUser(String User_Name)
	{
		Login_User.clear();
		Login_User.sendKeys(User_Name);
	}
	
	public void setLoginPassword(String Password)
	{
		Login_Password.clear();
		Login_Password.sendKeys(Password);
	}
	
	public void click_Login()
	{
		Login_Button.click();
	}
	
	
}

