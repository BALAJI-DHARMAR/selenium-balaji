package com.test;

import java.io.File;
import java.io.IOException;
import java.util.jar.Attributes.Name;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		 
		WebDriver driver =new ChromeDriver(co); // upcasting
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		TakesScreenshot tks = (TakesScreenshot) driver; // narrowing
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\ pic1.png");
	    FileUtils.copyFile(source, destination);
	    
	    driver.findElement(By.name("email")).sendKeys("7904547505");
	    driver.findElement(By.name("pass")).sendKeys("7904547505");
	    driver.findElement(By.name("login")).click();
	    
	    Thread.sleep(5000);
	    File lg = tks.getScreenshotAs(OutputType.FILE);
	    File sc=new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\loginss.png");
	    
	    FileUtils.copyFile(lg, sc);
	    
	    
	    
		
		
}
}
