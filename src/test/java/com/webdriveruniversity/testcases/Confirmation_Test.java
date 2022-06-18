package com.webdriveruniversity.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Test {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Element=driver.findElement(By.xpath("//h1[contains(.,'TO DO LIST')]"));
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].scrollIntoView();", Element);
		
		driver.findElement(By.xpath("//h4[contains(.,'Task1 [ ] - Task2 [ ] - Task3 [ ] - Task4 [ ] - Task5 [ ]')]")).click();
		
		driver.close();

	}

}
