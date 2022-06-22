package com.webdriveruniversity.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		/*Actions actions=new Actions(driver);
		actions.click(Element).build().perform();
		*/
		/*JavascriptExecutor JS=((JavascriptExecutor)driver);
		
		JS.executeScript("arguments[0].click();",Element);*/
		Element.click();
		Thread.sleep(3000);
		
		System.out.println("Test_Pass");
		driver.close();

	}

}
