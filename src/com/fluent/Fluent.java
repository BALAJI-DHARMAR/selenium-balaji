package com.fluent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions cops = new ChromeOptions();
		cops.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement creatnewaccbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnewaccbutton.click();
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		//---- doubt-----------
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("Balaji D S");
		
		
	}
	
	
	
}
