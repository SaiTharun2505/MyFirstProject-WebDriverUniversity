package com.webdriveruniversity.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.webdriveruniversity.pageobjects.Actions_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class Actions_Page_Test extends Base_Page_Test
{
	
	
	@Test
	public void Test_Case_030()
	{
		Actions_Page page_objects=new Actions_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_objects.Actions_Page_Link);
		page_objects.Click_Action_Page_Link();
		rk.Window_switch("WebDriver | Actions");
		Assert.assertEquals(driver.getTitle(), "WebDriver | Actions");
		Reporter.log("Test Case 030 : On Clicking Actions page link, link is redirecting to Actions page", true);
	}
	
	@Test
	public void Test_Case_031()
	{
		Actions_Page page_objects=new Actions_Page(driver);
		Assert.assertEquals(page_objects.Drop_Status(), "DROP HERE!");
		page_objects.Drag_And_Drop();
		Assert.assertEquals(page_objects.Drop_Status(), "Dropped!");
		Reporter.log("Test Case 031 : Drag and Drop is Working as Expected", true);	
	}
	
	@Test
	public void Test_Case_032() throws Exception
	{
		Actions_Page page_objects=new Actions_Page(driver);
		Assert.assertEquals(page_objects.Double_Click_Me.getAttribute("className"), "div-double-click");
		page_objects.Double_Click_Me();
		Assert.assertEquals(page_objects.Double_Click_Me.getAttribute("className"), "div-double-click double");
		Reporter.log("Test Case 032 : Double click working as expected",true);
	}
	
	@Test
	public void Test_Case_033() throws Exception
	{
		Actions_Page page_objects=new Actions_Page(driver);
		page_objects.Hover_Me_First();
		page_objects.Click_Hover_Me_First_Link1();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Well done you clicked on the link!");
		driver.switchTo().alert().accept();
		Reporter.log("Test Case 033 : Mouse Action & Link clicked successfully", true);
	}
	
	@Test
	public void Test_Case_034() throws Exception
	{
		Actions_Page page_objects=new Actions_Page(driver);
		page_objects.Hover_Me_Second();
		page_objects.Click_Hover_Me_Second_Link1();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Well done you clicked on the link!");
		driver.switchTo().alert().accept();
		Reporter.log("Test Case 034 : Mouse Action & Link clicked successfully", true);
	}
	
	@Test
	public void Test_Case_035() throws Exception
	{
		Actions_Page page_objects=new Actions_Page(driver);
		page_objects.Hover_Me_Third();
		page_objects.Click_Hover_Me_Third_Link1();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Well done you clicked on the link!");
		driver.switchTo().alert().accept();
		Reporter.log("Test Case 035 : Mouse Action & Link clicked successfully", true);
	}
	
	@Test
	public void Test_Case_036() throws Exception
	{
		Actions_Page page_objects=new Actions_Page(driver);
		page_objects.Hover_Me_Third();
		page_objects.Click_Hover_Me_Third_Link1();
		Assert.assertEquals(driver.switchTo().alert().getText(),"Well done you clicked on the link!");
		driver.switchTo().alert().accept();
		Reporter.log("Test Case 036 : Mouse Action & Link clicked successfully", true);
	}
	
	@Test
	public void Test_Case_037()
	{
		Actions_Page page_objects=new Actions_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_objects.Click_And_Hold);
		page_objects.Click_And_Hold();
		Assert.assertEquals(page_objects.Click_And_Hold.getText(), "Well done! keep holding that click now.....");
		Reporter.log("Test Case 037 : Click & Hold Action wokring as expected", true);
	}
	
	

}
