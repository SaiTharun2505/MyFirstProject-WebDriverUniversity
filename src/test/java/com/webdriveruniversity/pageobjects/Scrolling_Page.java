package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scrolling_Page
{
	Actions actions;
	JavascriptExecutor JS;
	public Scrolling_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
		JS=(JavascriptExecutor)driver;
	}
	
	@FindBy(xpath = "//h1[contains(.,'SCROLLING AROUND')]")
	public WebElement Scrolling_Around_Page_Link;
	
	@FindBy(xpath = "//h4[contains(.,'Scrolling Around...')]")
	public WebElement Scrolling_Around_Page_Link1;
	
	@FindBy(xpath = "//div[@id='zone1']")
	public WebElement Scroll_Me_First;
	
	@FindBy(xpath = "//h1[@id='zone2-entries']")
	public WebElement Entries1;
	
	@FindBy(xpath = "//h1[@id='zone3-entries']")
	public WebElement Entries2;
	
	@FindBy(xpath = "//div[@id='zone4']")
	public WebElement Dont_Forgot_To_Scroll_Me;
	
	public void Click_Scrolling_Around_Page_Link()
	{
		Scrolling_Around_Page_Link1.click();
	}
	
	public void Scroll_Me_First()
	{
		actions.moveToElement(Scroll_Me_First).perform();
	}
	
	public void Scroll_To_Entries1()
	{
		actions.moveToElement(Entries1).perform();
	}
	
	public void Scroll_To_Entries2()
	{
		actions.moveToElement(Entries2).perform();
	}
	
	public void Dont_Forgot_To_Scroll_Me()
	{
		actions.moveToElement(Dont_Forgot_To_Scroll_Me).perform();
	}

}
