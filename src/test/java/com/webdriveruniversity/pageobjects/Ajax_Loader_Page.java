package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ajax_Loader_Page 
{
	WebDriver driver;
	public Ajax_Loader_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(.,'AJAX LOADER')]")
	public WebElement Ajax_Loader_Page_Link;
	
	@FindBy(xpath = "//h4[contains(.,'Wait..... for the Ajax Loader')]")
	public WebElement Ajax_Loader_Page_Link1;
	
	@FindBy(xpath = "//div[contains(@id,'myDiv')]")
	public WebElement Click_Button;
	
	@FindBy(xpath = "//h4[@class='modal-title']")
	public WebElement Modal_Dialog;
	
	@FindBy(xpath = "//button[contains(.,'Close')]")
	public WebElement Modal_Dialog_Close;
	
	public void Click_Ajax_Loader_Page_Link()
	{
		Ajax_Loader_Page_Link1.click();
	}
	
	public void Click_Click_Button()
	{
		/*Actions actions=new Actions(driver);
		actions.click(Click_Button).build().perform();*/
		Click_Button.click();
	}
	
	public String Get_Modal_dialog_Text()
	{
		return Modal_Dialog.getText();
	}
	
	public void Close_Modal_Dialog()
	{
		Modal_Dialog_Close.click();
	}

}
