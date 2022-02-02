package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("8760819681");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8760819681");
//		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		WebElement fi = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]")); 
		String t = fi.getText();
		System.out.println(t);
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
				
	}
	
	
}
