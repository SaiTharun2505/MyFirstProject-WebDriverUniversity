package com.webdriveruniversity.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DCR_Page 
{
	WebDriver driver;
	public DCR_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(.,'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]")
	public WebElement DCR_Page_Link;

	@FindBy(xpath = "//h4[contains(.,'The choice is yours!')]")
	public WebElement DCR_Page_Link_1;
	
	@FindBy(xpath = "//h2[contains(.,'Dropdown Menu(s)')]")
	public WebElement DropDown_Menu_Text;
	
	public String Expected_DMT="Dropdown Menu(s)";
	
	@FindBy(xpath = "//select[@id='dropdowm-menu-1']")
	public WebElement DropDown_1;
	
	@FindBy(xpath = "//select[@id='dropdowm-menu-2']")
	public WebElement DropDown_2;
	
	@FindBy(xpath = "//select[@id='dropdowm-menu-3']")
	public WebElement DropDown_3;
	
	@FindBy(xpath = "//h2[contains(.,'Checkboxe(s)')]")
	public WebElement Check_Box_Text;
	
	public String Expected_CBT="Checkboxe(s)";
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Check_Box_1;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement Check_Box_2;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	public WebElement Check_Box_3;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	public WebElement Check_Box_4;
	
	@FindBy(xpath = "//h2[contains(.,'Radio Button(s)')]")
	public WebElement Radio_Button_Text;
	
	public String Expected_RBT="Radio Button(s)";
	
	@FindBy(xpath = "(//input[@name='color'])[1]")
	public WebElement Radio_Button_1;
	
	@FindBy(xpath = "(//input[@name='color'])[2]")
	public WebElement Radio_Button_2;
	
	@FindBy(xpath = "(//input[@name='color'])[3]")
	public WebElement Radio_Button_3;
	
	@FindBy(xpath = "(//input[@name='color'])[4]")
	public WebElement Radio_Button_4;
	
	@FindBy(xpath = "(//input[@name='color'])[5]")
	public WebElement Radio_Button_5;
	
	@FindBy(xpath = "//h2[contains(.,'Selected & Disabled')]")
	public WebElement Selected_Disabled_Text;
	
	public String Expected_SDT="Selected & Disabled";
	
	@FindBy(xpath = "(//input[@name='vegetable'])[1]")
	public WebElement SD_Radio_Button_1;
	
	@FindBy(xpath = "(//input[@name='vegetable'])[2]")
	public WebElement SD_Radio_Button_2;
	
	@FindBy(xpath = "(//input[@name='vegetable'])[3]")
	public WebElement SD_Radio_Button_3;
	
	@FindBy(xpath = "//select[@id='fruit-selects']")
	public WebElement SD_Drop_Down;
	
	public void Click_DCR_Page_Link()
	{
		DCR_Page_Link_1.click();
	}
	
	public String Actual_DMT()
	{
		return DropDown_Menu_Text.getText();
	}
	
	public Select select_DropDown_1()
	{
		return new Select(DropDown_1);
	}
	
	public String Default_Option_DD1="JAVA";
	public String DropDown_1_Options[]= {"JAVA","C#","Python","SQL"};
	
	public Select select_DropDown_2()
	{
		return new Select(DropDown_2);
	}
	
	public String Default_Option_DD2="Eclipse";
	public String DropDown_2_Options[]= {"Eclipse","Maven","TestNG","JUnit"};
	
	public Select select_DropDown_3()
	{
		return new Select(DropDown_3);
	}
	
	public String Default_Option_DD3="HTML";
	public String DropDown_3_Options[]= {"HTML","CSS","JavaScript","JQuery"};
	
	public String Actual_CBT()
	{
		return Check_Box_Text.getText();
	}
	
	public void click_Check_Box_1()
	{
		Check_Box_1.click();
	}
	
	public void click_Check_Box_2()
	{
		Check_Box_2.click();
	}
	
	public void click_Check_Box_3()
	{
		Check_Box_3.click();
	}
	
	public void click_Check_Box_4()
	{
		Check_Box_4.click();
	}
	
	public String Actual_RBT()
	{
		return Radio_Button_Text.getText();
	}
	
	public void click_Radio_Button_1()
	{
		Radio_Button_1.click();
	}
	
	public void click_Radio_Button_2()
	{
		Radio_Button_2.click();
	}
	
	public void click_Radio_Button_3()
	{
		Radio_Button_3.click();
	}
	
	public void click_Radio_Button_4()
	{
		Radio_Button_4.click();
	}
	
	public void click_Radio_Button_5()
	{
		Radio_Button_5.click();
	}
	
	public String Actual_SDT()
	{
		return Selected_Disabled_Text.getText();
	}
	
	public void  Click_SD_Radio_Button_1()
	{
		SD_Radio_Button_1.click();
	}
	
	public void  Click_SD_Radio_Button_3()
	{
		SD_Radio_Button_3.click();
	}
	
	public Select select_SD_Drop_Down()
	{
		return new Select(SD_Drop_Down);
	}
	
	
	
	
	
	
	
	
	
	
}
