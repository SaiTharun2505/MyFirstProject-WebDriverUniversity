package com.webdriveruniversity.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Page_Test 
{
	static WebDriver driver;
	static WebDriverWait wait;

	@Parameters("Browser")
	@BeforeClass
	public void Browser_Launch(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
			Map<String, Object> prefs=new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications",2);
			ChromeOptions options= new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(options);
			driver.get("https://webdriveruniversity.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			new WebDriverWait(driver, 30);
		}
		
		else if(Browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://webdriveruniversity.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(Browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://webdriveruniversity.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("No Browser Initiated");
		}
	}
	
	@AfterClass
	public void Browser_Close()
	{
		driver.quit();
	}

}


