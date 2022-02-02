package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions s = new ChromeOptions();
	s.addArguments("incognito");
	WebDriver driver = new ChromeDriver(s);
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		//
		driver.switchTo().frame("SingleFrame");
		WebElement Send = driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(3000);
	     Send.sendKeys("Hey This Is Sigle Frame");
	     driver.switchTo().defaultContent();
	//
	Thread.sleep(3000);
	WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	multi.click();
	WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outer);
	WebElement inner = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
	driver.switchTo().frame(inner);
	
	WebElement sendkey = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(3000);
	sendkey.sendKeys("Then this is inner frame Keys");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Video']")).click();

	
}
}
