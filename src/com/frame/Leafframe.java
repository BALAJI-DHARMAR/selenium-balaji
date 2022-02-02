package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leafframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions chr = new ChromeOptions();
	chr.addArguments("incognito");
	WebDriver driver = new ChromeDriver(chr);
	
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/frame.html");
	Thread.sleep(4000);
	
	WebElement first = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	driver.switchTo().frame(first);
	WebElement cl = driver.findElement(By.id("Click"));
	cl.click();
	driver.switchTo().defaultContent();
	 
 
	WebElement inner = driver.findElement(By.name("frame2"));
	driver.switchTo().frame(inner);


	
	
}
}
