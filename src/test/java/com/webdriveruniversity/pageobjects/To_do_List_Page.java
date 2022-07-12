package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class To_do_List_Page 
{
	WebDriver driver;
	
	public To_do_List_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(.,'TO DO LIST')]") 
	public WebElement To_do_List_Page_Link;
	
	@FindBy(xpath = "//h4[contains(.,'Task1 [ ] - Task2 [ ] - Task3 [ ] - Task4 [ ] - Task5 [ ]')]")
	public WebElement To_do_List_Page_Link_1;
	
	@FindBy(xpath = "//i[@id='plus-icon']")
	public WebElement Plus_Button;
	
	@FindBy(xpath = "//input[@placeholder='Add new todo']")
	public WebElement Add_New_To_Do;
	
	@FindBy(xpath = "//li[contains(.,'Go to potion class')]")
	public WebElement Go_To_Portion_Class;
	
	@FindBy(xpath = "//li[contains(.,'Buy new robes')]")
	public WebElement Buy_new_robes;
	
	@FindBy(xpath = "//li[contains(.,'Practice magic')]")
	public WebElement Practice_Magic;
	
	@FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
	public WebElement Delete_from_toDo;
	
	@FindBy(xpath = "//ul/li[1]")
	public WebElement To_do_List_Text;
	
	public void Click_To_do_List_Page_Link()
	{
		To_do_List_Page_Link_1.click();
	}
	
	public void Click_Plus_Button()
	{
		Plus_Button.click();
	}
	
	public void Add_New_To_Do(String text)
	{
		Add_New_To_Do.clear();
		Add_New_To_Do.sendKeys(text);
		Add_New_To_Do.sendKeys(Keys.ENTER);
	}
	
	public void Click_Go_To_Portion_Class()
	{
		Go_To_Portion_Class.click();
	}
	
	public void Click_Buy_new_robes()
	{
		Buy_new_robes.click();
	}
	
	public void Click_Practice_Magic()
	{
		Practice_Magic.click();
	}
	
	public void Click_Delete_from_toDo()
	{
		Delete_from_toDo.click();
	}
	
	public String To_Do_List_Text()
	{
		return To_do_List_Text.getText();
	}
	

	




}
