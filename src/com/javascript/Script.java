package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("incognito");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor jc = (JavascriptExecutor) driver;
//		WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));
//		jc.executeScript("arguments[0].scrollIntoView();",logo);  //important for keep pascal or camel //	Thread.sleep(3000);
		jc.executeScript("window.scrollBy(0,-6000);");
//		Thread.sleep(3000);
//		jc.executeScript("window.scrollBy(0,3000);");
//		
		 
		
	}

}
