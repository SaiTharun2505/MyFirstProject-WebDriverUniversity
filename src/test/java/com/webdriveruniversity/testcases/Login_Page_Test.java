package com.webdriveruniversity.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.webdriveruniversity.pageobjects.Login_Page;
import com.webdriveruniversity.utilities.Data_Driven_Reusable;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class Login_Page_Test extends Base_Page_Test
{	
		@Test
		public void TestCase_001()
		{
			Login_Page page_object=new Login_Page(driver);
			Reusable_Keywords rk=new Reusable_Keywords(driver);
			rk.ScrollIntoView(page_object.Login_Portal);
			page_object.click_Login_portal();
			rk.Window_switch("WebDriver | Login Portal");
			
			Assert.assertTrue(driver.getTitle().contains("WebDriver | Login Portal"));
			Reporter.log("Test case 1 : On Clicking Login Portal link redirecting to Login Page : "+driver.getTitle().contains("WebDriver | Login Portal"),true);
		}
	
		@Test(dependsOnMethods="TestCase_001")
		public void TestCase_002()
		{
			SoftAssert softAssertion=new SoftAssert();
			Login_Page page_object=new Login_Page(driver);
			
			Data_Driven_Reusable.Access_To_Work_Book();
			System.out.println(Data_Driven_Reusable.getcelldata(1, 0));
			page_object.setLoginUser(Data_Driven_Reusable.getcelldata(1, 0));
			page_object.setLoginPassword(Data_Driven_Reusable.getcelldata(1, 1));
			page_object.click_Login();
			
			Assert.assertTrue(driver.switchTo().alert().getText().contains("validation succeeded"));
			Reporter.log("Test Case 2 : Login Successful using valid credentials : "+driver.switchTo().alert().getText().contains("validation succeeded"),true);
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			softAssertion.assertAll();
		}
		
		@Test(dependsOnMethods="TestCase_001")
		public void TestCase_003()
		{
			SoftAssert softAssertion=new SoftAssert();
			Login_Page page_object=new Login_Page(driver);
			page_object.setLoginUser("Sai Tharun");
			page_object.setLoginPassword("sdgffsdgh");
			page_object.click_Login();
			
			
			softAssertion.assertTrue(driver.switchTo().alert().getText().contains("validation failed"));
			Reporter.log("Test Case 3 : Login unsuccessful using invalid credentials : "+driver.switchTo().alert().getText().contains("validation failed"),true);
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			softAssertion.assertAll();
		}
		
		@Test(dependsOnMethods="TestCase_001")
		public void TestCase_004()
		{
			SoftAssert softAssertion=new SoftAssert();
			Login_Page page_object=new Login_Page(driver);
			page_object.setLoginUser("");
			page_object.setLoginPassword("sdgffsdgh");
			page_object.click_Login();
			
			softAssertion.assertTrue(driver.switchTo().alert().getText().contains("validation failed"));
			Reporter.log("Test Case 4 : Login unsuccessful using invalid credentials : "+driver.switchTo().alert().getText().contains("validation failed"),true);
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			softAssertion.assertAll();
		}
		
		@Test(dependsOnMethods="TestCase_001")
		public void TestCase_005()
		{
			SoftAssert softAssertion=new SoftAssert();
			Login_Page page_object=new Login_Page(driver);
			page_object.setLoginUser("");
			page_object.setLoginPassword("");
			page_object.click_Login();
			
			softAssertion.assertTrue(driver.switchTo().alert().getText().contains("validation failed"));
			Reporter.log("Test Case 5 : Login unsuccessful using invalid credentials : "+driver.switchTo().alert().getText().contains("validation failed"),true);
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			softAssertion.assertAll();
		}
}
