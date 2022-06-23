package com.webdriveruniversity.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webdriveruniversity.pageobjects.To_do_List_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class To_do_List_Test extends Base_Page_Test
{
	@Test
	public void Test_Case_010()
	{
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		rk.ScrollIntoView(page_objects.To_do_List_Page_Link);
		page_objects.Click_To_do_List_Page_Link();
		rk.Window_switch("WebDriver | To Do List");
		Assert.assertEquals("WebDriver | To Do List", driver.getTitle());
		Reporter.log("Test Case 010 : On Clicking the To do list link redireccting to to do list page : "+driver.getTitle().contains("WebDriver | To Do List"),true);
	}
	
	@Test
	public void Test_Case_011()
	{
		
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		Assert.assertTrue(page_objects.Add_New_To_Do.isDisplayed());
		Reporter.log("Test Case 011 : On Launching the page Add new to do field is Displayed : "+page_objects.Add_New_To_Do.isDisplayed(),true);
	}
	
	@Test
	public void Test_Case_012()
	{
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		page_objects.Click_Plus_Button();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(page_objects.Add_New_To_Do));
		Assert.assertFalse(page_objects.Add_New_To_Do.isDisplayed());
		Reporter.log("Test Case 012 : On Clicking the plus button Add new to do field is Hidden if it is displayed earlier: "+!page_objects.Add_New_To_Do.isDisplayed(),true);
		
	}
	
	@Test
	public void Test_Case_013()
	{
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		page_objects.Click_Plus_Button();
		Assert.assertTrue(page_objects.Add_New_To_Do.isDisplayed());
		Reporter.log("Test Case 013 : On Clicking the plus button Add new to do field is Displayed if it is in Hidden state earlier : "+page_objects.Add_New_To_Do.isDisplayed(),true);
		
	}
	
	@Test
	public void Test_Case_014()
	{
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		page_objects.Click_Go_To_Portion_Class();
		Assert.assertEquals("completed",page_objects.Go_To_Portion_Class.getAttribute("class"));
		Reporter.log("Test Case 014 : On Clicking the Go To Portion class button, its status changed to completed : "+page_objects.Go_To_Portion_Class.getAttribute("class").contains("completed"),true);
	}
	
	@Test
	public void Test_Case_015()
	{
		
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		page_objects.Click_Buy_new_robes();
		Assert.assertEquals("completed",page_objects.Go_To_Portion_Class.getAttribute("class"));
		Reporter.log("Test Case 015 : On Clicking the Buy New Robes button, its status changed to completed : "+page_objects.Go_To_Portion_Class.getAttribute("class").contains("completed"),true);
	}
	
	@Test
	public void Test_Case_016()
	{
		
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		page_objects.Click_Practice_Magic();
		Assert.assertEquals("completed",page_objects.Go_To_Portion_Class.getAttribute("class"));
		Reporter.log("Test Case 016 : On Clicking the practice magic button, its status changed to completed : "+page_objects.Go_To_Portion_Class.getAttribute("class").contains("completed"),true);
	}
	
	@Test
	public void Test_Case_017() throws InterruptedException
	{
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		for (int i = 0; i <= 2; i++) 
		{
			page_objects.Click_Delete_from_toDo();
			Thread.sleep(500);
		}	
		Assert.assertTrue(!driver.getPageSource().contains("Go to potion class"));
		Assert.assertTrue(!driver.getPageSource().contains("Buy new robes"));
		Assert.assertTrue(!driver.getPageSource().contains("Practice magic"));
		Reporter.log("Test Case 017 : User Able to Delete to do list one by one : "+!driver.getPageSource().contains("Practice magic"),true);
	}
	
	@Test
	public void Test_Case_018()
	{
		To_do_List_Page page_objects=new To_do_List_Page(driver);
		if(page_objects.Add_New_To_Do.isDisplayed())
		{
			page_objects.Add_New_To_Do("Go to Gym");
			page_objects.Add_New_To_Do("Go to Ladakh");
		}
		else
		{
			page_objects.Click_Plus_Button();
			page_objects.Add_New_To_Do("Go to Gym");
			page_objects.Add_New_To_Do("Go to Ladakh");
		}
		Assert.assertEquals("Go to Gym",page_objects.To_Do_List_Text());
		Reporter.log("Test Case 018 : User Able to add to do actions in To do list : "+page_objects.To_Do_List_Text(),true);
	}

	

}
