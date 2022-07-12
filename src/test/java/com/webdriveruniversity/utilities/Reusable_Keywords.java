package com.webdriveruniversity.utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusable_Keywords 
{
	WebDriver driver;
	
	public Reusable_Keywords(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Window switch method
	public void Window_switch(String title)
	{
		Set<String> All_WNDS=driver.getWindowHandles();
		
		for(String Single_Win:All_WNDS)
		{
			driver.switchTo().window(Single_Win);
			if(driver.getTitle().contains(title))
			{
				break;
			}
		}
	}
	
	//Scroll in to view method
	public void ScrollIntoView(WebElement Element)
	{
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].scrollIntoView();", Element);
	}
	
	

}
