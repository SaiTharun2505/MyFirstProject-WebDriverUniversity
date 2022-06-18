package com.webdriveruniversity.testcases;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.webdriveruniversity.pageobjects.Buttons_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class Buttons_Page_Test extends Base_Page_Test
{
	@Test
	public void TestCase_006()
	{
		Buttons_Page page_objects=new Buttons_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_objects.Button_page_link);
		page_objects.Click_Button_Page_Link();
		rk.Window_switch("WebDriver | Button Clicks");
		
		Assert.assertTrue(driver.getTitle().contains("WebDriver | Button Clicks"));
		Reporter.log("Test Case 6 : On clicking buttons links redirecting to buttons Page : "+driver.getTitle().contains("WebDriver | Button Clicks"),true);
	}
	
	@Test(dependsOnMethods="TestCase_006")
	public void TestCase_007() throws Exception
	{
		SoftAssert softAssertion=new SoftAssert();
		Buttons_Page page_objects=new Buttons_Page(driver);
		page_objects.Webelement_click();
		Thread.sleep(2000);
		
		softAssertion.assertTrue(page_objects.Webelement_Click_Modal().contains("Congratulations!"));
		Reporter.log("Test Case 7 : User Able to click the Webelement click : "+page_objects.Webelement_Click_Modal().contains("Congratulations!"),true);
		page_objects.Webelement_Click_Modal_Close();
		softAssertion.assertAll();
		
	}
	
	@Test(dependsOnMethods="TestCase_006")
	public void TestCase_008() throws Exception
	{
		SoftAssert softAssertion=new SoftAssert();
		Buttons_Page page_objects=new Buttons_Page(driver);
		page_objects.JavaScript_Click();
		Thread.sleep(2000);
		softAssertion.assertTrue(page_objects.JavaScript_Click_Modal().contains("It’s that Easy!! Well I think it is....."));
		Reporter.log("Test Case 8 : User Able to click the Javascript click : "+page_objects.JavaScript_Click_Modal().contains("It’s that Easy!! Well I think it is....."),true);
		page_objects.JavaScript_Click_Modal_Close();
		softAssertion.assertAll();
		
	}

	@Test(dependsOnMethods="TestCase_006")
	public void TestCase_009() throws Exception
	{
		SoftAssert softAssertion=new SoftAssert();
		Buttons_Page page_objects=new Buttons_Page(driver);
		Thread.sleep(2000);
		page_objects.Action_Move_Click();
		Thread.sleep(2000);
		softAssertion.assertTrue(page_objects.Action_Move_Click_Modal().contains("Well done! the Action Move & Click can become very useful!"));
		Reporter.log("Test Case 9 : User Able to click the Action Move click : "+page_objects.Action_Move_Click_Modal().contains("Well done! the Action Move & Click can become very useful!"),true);
		page_objects.Action_Move_Click_Modal_Close();
		softAssertion.assertAll();	
	}
	
	


}
