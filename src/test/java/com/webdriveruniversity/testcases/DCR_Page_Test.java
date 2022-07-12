package com.webdriveruniversity.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webdriveruniversity.pageobjects.DCR_Page;
import com.webdriveruniversity.utilities.Reusable_Keywords;

public class DCR_Page_Test extends Base_Page_Test
{
	
	@Test
	public void Test_Case_019() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		Reusable_Keywords rk=new Reusable_Keywords(driver);
		rk.ScrollIntoView(page_object.DCR_Page_Link);
		//Thread.sleep(2000);
		page_object.Click_DCR_Page_Link();
		rk.Window_switch("WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)");
		Assert.assertTrue(driver.getTitle().contains("WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)"));
		Reporter.log("Test Case 019 : On clicking DCR page link redirecting to DCR Page : "+driver.getTitle().contains("WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)"),true);
	}
	
	@Test
	public void Test_Case_020() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		Assert.assertTrue(page_object.Expected_DMT.equals(page_object.Actual_DMT()));
		Assert.assertTrue(page_object.select_DropDown_1().getFirstSelectedOption().getText().equals(page_object.Default_Option_DD1));
		//Thread.sleep(2000);
		for (int i = 0; i < page_object.select_DropDown_1().getOptions().size(); i++)
		{
			page_object.select_DropDown_1().selectByIndex(i);
			Assert.assertTrue(page_object.select_DropDown_1().getFirstSelectedOption().getText().equals(page_object.DropDown_1_Options[i]));
			//Thread.sleep(1000);
		}
		
		Reporter.log("Test Case 020 : DropDown one is working according to user expectations : "+true,true);
	}
	
	@Test
	public void Test_Case_021() throws Exception
	{
		
		DCR_Page page_object=new DCR_Page(driver);
		Assert.assertTrue(page_object.Expected_DMT.equals(page_object.Actual_DMT()));
		Assert.assertTrue(page_object.select_DropDown_2().getFirstSelectedOption().getText().equals(page_object.Default_Option_DD2));
		//Thread.sleep(2000);
		for (int i = 0; i < page_object.select_DropDown_2().getOptions().size(); i++)
		{
			page_object.select_DropDown_2().selectByIndex(i);
			Assert.assertTrue(page_object.select_DropDown_2().getFirstSelectedOption().getText().equals(page_object.DropDown_2_Options[i]));
			//Thread.sleep(2000);
		}
		
		Reporter.log("Test Case 021 : DropDown two is working according to user expectations : "+true,true);
	}
	
	@Test
	public void Test_Case_022() throws Exception
	{
		
		DCR_Page page_object=new DCR_Page(driver);
		Assert.assertTrue(page_object.Expected_DMT.equals(page_object.Actual_DMT()));
		Assert.assertTrue(page_object.select_DropDown_3().getFirstSelectedOption().getText().equals(page_object.Default_Option_DD3));
		//Thread.sleep(2000);
		for (int i = 0; i < page_object.select_DropDown_3().getOptions().size(); i++)
		{
			page_object.select_DropDown_3().selectByIndex(i);
			Assert.assertTrue(page_object.select_DropDown_3().getFirstSelectedOption().getText().equals(page_object.DropDown_3_Options[i]));
			//Thread.sleep(2000);
		}
		
		Reporter.log("Test Case 022 : DropDown three is working according to user expectations : "+true,true);
	}
	
	@Test
	public void Test_Case_023() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		Assert.assertTrue(page_object.Expected_CBT.equals(page_object.Actual_CBT()));
		page_object.click_Check_Box_1();
		//Thread.sleep(2000);
		Assert.assertTrue(page_object.Check_Box_1.isSelected());
		Reporter.log("Test Case 023 : User able to select first check Box : "+page_object.Check_Box_1.isSelected(),true);
	}
	
	@Test
	public void Test_Case_024() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		page_object.click_Check_Box_2();
		//Thread.sleep(2000);
		Assert.assertTrue(page_object.Check_Box_2.isSelected());
		Reporter.log("Test Case 024 : User able to select second check Box : "+page_object.Check_Box_2.isSelected(),true);
	}
	
	@Test
	public void Test_Case_025() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		page_object.click_Check_Box_3();
	//	Thread.sleep(2000);
		Assert.assertTrue(!page_object.Check_Box_3.isSelected());
		Reporter.log("Test Case 025 : User able to unselect third check Box : "+!page_object.Check_Box_3.isSelected(),true);
	}
	
	@Test
	public void Test_Case_026() throws Exception
	{
		DCR_Page page_object=new DCR_Page(driver);
		page_object.click_Check_Box_4();
	//	Thread.sleep(2000);
		Assert.assertTrue(page_object.Check_Box_4.isSelected());
		Reporter.log("Test Case 026 : User able to select second check Box : "+page_object.Check_Box_4.isSelected(),true);
	}
	
	@Test
	public void Test_Case_027() throws InterruptedException
	{
		DCR_Page page_object=new DCR_Page(driver);
		Assert.assertTrue(page_object.Expected_RBT.equals(page_object.Actual_RBT()));
		
		for (int i = 0; i < 5; i++)
		{
			if(i==0)
			{
				page_object.click_Radio_Button_1();
				Assert.assertTrue(page_object.Radio_Button_1.isSelected());
				Assert.assertFalse(page_object.Radio_Button_2.isSelected() 
						&& page_object.Radio_Button_3.isSelected()
						&& page_object.Radio_Button_4.isSelected()
						&& page_object.Radio_Button_5.isSelected());
				Reporter.log("Test Case 027 : Radio Button 1 is Working as Expected : "+page_object.Radio_Button_1.isSelected(),true);					
			}
			else if(i==1)
			{
				page_object.click_Radio_Button_2();
				Assert.assertTrue(page_object.Radio_Button_2.isSelected());
				Assert.assertFalse(page_object.Radio_Button_1.isSelected() 
						&& page_object.Radio_Button_3.isSelected()
						&& page_object.Radio_Button_4.isSelected()
						&& page_object.Radio_Button_5.isSelected());
				Reporter.log("Test Case 027 : Radio Button 2 is Working as Expected : "+page_object.Radio_Button_2.isSelected(),true);					
			
			}
			else if(i==2)
			{
				page_object.click_Radio_Button_3();
				Assert.assertTrue(page_object.Radio_Button_3.isSelected());
				Assert.assertFalse(page_object.Radio_Button_1.isSelected() 
						&& page_object.Radio_Button_2.isSelected()
						&& page_object.Radio_Button_4.isSelected()
						&& page_object.Radio_Button_5.isSelected());
				Reporter.log("Test Case 027 : Radio Button 3 is Working as Expected : "+page_object.Radio_Button_3.isSelected(),true);					
			
			}
			else if(i==3)
			{
				page_object.click_Radio_Button_4();
				Assert.assertTrue(page_object.Radio_Button_4.isSelected());
				Assert.assertFalse(page_object.Radio_Button_1.isSelected() 
						&& page_object.Radio_Button_2.isSelected()
						&& page_object.Radio_Button_3.isSelected()
						&& page_object.Radio_Button_5.isSelected());
				Reporter.log("Test Case 027 : Radio Button 4 is Working as Expected : "+page_object.Radio_Button_4.isSelected(),true);					
			
			}
			else if(i==4)
			{
				page_object.click_Radio_Button_5();
				Assert.assertTrue(page_object.Radio_Button_5.isSelected());
				Assert.assertFalse(page_object.Radio_Button_1.isSelected()
						&& page_object.Radio_Button_2.isSelected() 
						&& page_object.Radio_Button_3.isSelected()
						&& page_object.Radio_Button_4.isSelected() );
				Reporter.log("Test Case 027 : Radio Button 5 is Working as Expected : "+page_object.Radio_Button_5.isSelected(),true);					
			
			}
			//Thread.sleep(2000);
			
		}
	}
	
	

}
