package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoalert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("incognito");
	WebDriver driver = new ChromeDriver(c);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement Alertwithok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
	Thread.sleep(5000);
	Alertwithok.click();
	Thread.sleep(3000);
	WebElement ok = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	ok.click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	//------------------//
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	//-------------------//
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	WebElement a = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	Thread.sleep(3000);
	a.click();
	driver.switchTo().alert().sendKeys("Hey it's Balaji D S Task");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
	
}
}
