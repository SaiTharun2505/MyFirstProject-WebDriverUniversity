package com.webdriveruniversity.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webdriveruniversity.pageobjects.Scrolling_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class Scrolling_Page_Test extends Base_Page_Test
{
	
	@Test
	public void Test_Case_038()
	{
		Scrolling_Page page_objects=new Scrolling_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_objects.Scrolling_Around_Page_Link);
		page_objects.Click_Scrolling_Around_Page_Link();
		rk.Window_switch("WebDriver | Scrolling");
		Assert.assertEquals(driver.getTitle(), "WebDriver | Scrolling");
		Reporter.log("Test Case 038: On clicking scroll around button, link is redirecting to scrolling page", true);
	}
	
	@Test
	public void Test_Case_039()
	{
		Scrolling_Page page_objects=new Scrolling_Page(driver);
		page_objects.Scroll_Me_First();
		Assert.assertEquals(page_objects.Scroll_Me_First.getText(), "Well done for scrolling to me!");
		Reporter.log("Test Case 039: User able to scroll to scroll me first element", true);
	}
	
	@Test
	public void Test_Case_040()
	{
		Scrolling_Page page_objects=new Scrolling_Page(driver);
		page_objects.Scroll_To_Entries1();
		Assert.assertEquals(page_objects.Entries1.getText(), "1 Entries");
		Reporter.log("Test Case 040: User able to scroll entries1", true);
	}
	
	@Test
	public void Test_Case_041()
	{
		Scrolling_Page page_objects=new Scrolling_Page(driver);
		page_objects.Scroll_To_Entries2();
		Assert.assertEquals(page_objects.Entries2.getText(), "1 Entries");
		Reporter.log("Test Case 041: User able to scroll entries2", true);
	}
	
	@Test(dependsOnMethods="Test_Case_038")
	public void Test_Case_042() throws InterruptedException
	{
		Scrolling_Page page_objects=new Scrolling_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_objects.Dont_Forgot_To_Scroll_Me);
		Thread.sleep(1000);
		page_objects.Dont_Forgot_To_Scroll_Me();
		Assert.assertEquals(page_objects.Dont_Forgot_To_Scroll_Me.getText(),"X: 659Y: 816");
		Reporter.log("Test Case 042: User able to scroll to dont forget to scroll me button",true);
	}

}
