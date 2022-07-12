package com.webdriveruniversity.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webdriveruniversity.pageobjects.Ajax_Loader_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class Ajax_Loader_Page_Test extends Base_Page_Test
{
	
	@Test
	public void Test_Case_028()
	{
		Ajax_Loader_Page page_object=new Ajax_Loader_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_object.Ajax_Loader_Page_Link);
		page_object.Click_Ajax_Loader_Page_Link();
		rk.Window_switch("WebDriver | Ajax-Loader");
		Assert.assertEquals(driver.getTitle(), "WebDriver | Ajax-Loader");
		Reporter.log("Test Case 028 : On Clicking Ajax loader page link, link is redirecting to Ajax Loader Page", true);
	}
	
	@Test
	public void Test_Case_029() throws InterruptedException
	{
		Ajax_Loader_Page page_object=new Ajax_Loader_Page(driver);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(page_object.Click_Button));
		page_object.Click_Click_Button();
		Thread.sleep(2000);
		Assert.assertEquals(page_object.Get_Modal_dialog_Text() , "Well Done For Waiting....!!!");
		Reporter.log("Test Case 029 : On Clicking Click button Modal Dialog is Displayed with expected text", true);
		page_object.Close_Modal_Dialog();
	}

}
