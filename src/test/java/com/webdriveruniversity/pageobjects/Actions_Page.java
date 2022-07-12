package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actions_Page 
{
	WebDriver driver;
	Actions actions;
	
	public Actions_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	
	@FindBy(xpath = "//h1[contains(.,'ACTIONS')]")
	public WebElement Actions_Page_Link;
	
	@FindBy(xpath = "//h4[contains(.,'Can you really handle this challenge?')]")
	public WebElement Actions_Page_Link1;
	
	@FindBy(xpath = "//b[contains(.,'DRAG ME TO MY TARGET!')]")
	public WebElement Drag_Me_To_Target_URL;
	
	@FindBy(xpath = "//b[contains(.,'DROP HERE!')]")
	public WebElement Drop_Here;
	
	@FindBy(xpath = "//div[@id='droppable']/p/b")
	public WebElement Drop_Status;
	
	@FindBy(xpath = "//div[@id='double-click']")
	public WebElement Double_Click_Me;
	
	@FindBy(xpath = "(//button[@class='dropbtn'])[1]")
	public WebElement Hover_Me_First;
	
	@FindBy(xpath = "(//a[contains(.,'Link 1')])[1]")
	public WebElement Hover_Me_First_Link1;
	
	@FindBy(xpath = "(//button[@class='dropbtn'])[2]")
	public WebElement Hover_Me_Second;
	
	@FindBy(xpath = "(//a[contains(.,'Link 1')])[2]")
	public WebElement Hover_Me_Second_Link1;
	
	@FindBy(xpath = "(//button[@class='dropbtn'])[3]")
	public WebElement Hover_Me_Third;
	
	@FindBy(xpath = "(//a[contains(.,'Link 1')])[3]")
	public WebElement Hover_Me_Third_Link1;
	
	@FindBy(xpath = "(//a[contains(.,'Link 1')])[4]")
	public WebElement Hover_Me_Third_Link2;
	
	@FindBy(xpath = "//div[@id='click-box']")
	public WebElement Click_And_Hold;
	
	public void Click_Action_Page_Link()
	{
		Actions_Page_Link1.click();
	}
	
	public void Drag_And_Drop()
	{
		actions.dragAndDrop(Drag_Me_To_Target_URL, Drop_Here).build().perform();
	}
	
	public String Drop_Status()
	{
		return Drop_Status.getText();
	}
	
	public void Double_Click_Me()
	{
		actions.doubleClick(Double_Click_Me).build().perform();
	}
	
	public void Hover_Me_First()
	{
		actions.moveToElement(Hover_Me_First).build().perform();
	}
	
	public void Click_Hover_Me_First_Link1()
	{
		actions.click(Hover_Me_First_Link1).perform();
	}
	
	public void Hover_Me_Second()
	{
		actions.moveToElement(Hover_Me_Second).build().perform();
	}
	
	public void Click_Hover_Me_Second_Link1()
	{
		actions.click(Hover_Me_Second_Link1).perform();
	}
	
	public void Hover_Me_Third()
	{
		actions.moveToElement(Hover_Me_Third).build().perform();
	}
	
	public void Click_Hover_Me_Third_Link1()
	{
		actions.click(Hover_Me_Third_Link1).perform();
	}
	
	public void Click_Hover_Me_Third_Link2()
	{
		actions.click(Hover_Me_Third_Link2).perform();
	}
	
	public void Click_And_Hold()
	{
		actions.clickAndHold(Click_And_Hold).build().perform();
	}
	
	
	
	
	

}
