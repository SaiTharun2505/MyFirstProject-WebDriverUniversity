package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons_Page 
{
	WebDriver driver;
	
	
	public Buttons_Page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(.,'BUTTON CLICKS')]") 
	public WebElement Button_page_link;
	
	@FindBy(xpath = "//h4[contains(.,'WebElement Click, JavaScript Click, Actions Move & Click!')]") 
	public WebElement Button_page_link_1;
	
	@FindBy(xpath = "(//span[contains(@type,'button')])[1]")
	public WebElement Webelement_Click;
	
	@FindBy(xpath = "(//span[contains(@type,'button')])[2]") 
	public WebElement JavaScript_Click;
	
	@FindBy(xpath = "(//span[contains(@type,'button')])[3]") 
	public WebElement Action_Move_Click;
	
	@FindBy(xpath = "(//div[@class='modal-header']/h4)[1]") 
	public WebElement Webelement_Click_Modal;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[1]")
	public WebElement Webelement_click_Modal_Close;
	
	@FindBy(xpath = "(//div[@class='modal-header']/h4)[2]")
	public WebElement JavaScript_Click_Modal;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[2]") 
	public WebElement JavaScript_Click_Modal_Close;
	
	@FindBy(xpath = "(//div[@class='modal-header']/h4)[3]")
	public WebElement Action_Move_Click_Modal;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
	public WebElement Action_Move_Click_Modal_Close;
	
	
	public void Click_Button_Page_Link()
	{
		Button_page_link_1.click();
	}
	
	public void Webelement_click()
	{
		Webelement_Click.click();
		
	}
	
	public String Webelement_Click_Modal()
	{
		return Webelement_Click_Modal.getText();
	}
	
	public void Webelement_Click_Modal_Close()
	{
		Webelement_click_Modal_Close.click();
	}
	
	public void JavaScript_Click()
	{
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].click()", JavaScript_Click);

	}
	
	public String JavaScript_Click_Modal()
	{
		return JavaScript_Click_Modal.getText();
	}
	
	public void JavaScript_Click_Modal_Close()
	{
		JavaScript_Click_Modal_Close.click();
	}
	
	public void Action_Move_Click()
	{
		Actions actions = new Actions(driver);
		actions.click(Action_Move_Click).perform();

		
	}
	
	public String Action_Move_Click_Modal()
	{
		return Action_Move_Click_Modal.getText();
	}
	
	public void Action_Move_Click_Modal_Close()
	{
		Action_Move_Click_Modal_Close.click();
	}
}
