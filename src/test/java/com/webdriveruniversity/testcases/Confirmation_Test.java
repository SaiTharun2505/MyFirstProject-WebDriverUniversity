package com.webdriveruniversity.testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmation_Test {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		WebDriverWait wait =new WebDriverWait(driver, 30);
		
		WebElement Element=driver.findElement(By.xpath("//div[contains(@id,'myDiv')]"));
		
		wait.until(ExpectedConditions.visibilityOf(Element));
		Element.click();
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("hh-mm dd-MM-yyyy");
		String Time=sdf.format(date);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("E:\\PROFESSIONAL\\eclipse workspace\\MyFirstProject\\Screenshots\\"+Time+".png"));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Test_Pass");
		driver.close();
		
	}

}
