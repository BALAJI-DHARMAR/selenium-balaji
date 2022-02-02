package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Down {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions cop = new ChromeOptions();
	cop.addArguments("incognito");
	WebDriver driver = new ChromeDriver(cop); 
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.name("firstname")).sendKeys("BALAJI");
	driver.findElement(By.name("lastname")).sendKeys("D S");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7904547505");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("balaji95");
	
	WebElement sel = driver.findElement(By.id("day"));
	Select s = new Select(sel);
	
	s.selectByValue("19");
	
	WebElement sel1 = driver.findElement(By.id("month"));
	Select s1 =new Select(sel1);
	s1.selectByIndex(1);
	
	WebElement sel2 = driver.findElement(By.id("year"));
	Select s2 =new Select(sel2);
	s2.selectByVisibleText("1995");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	Thread.sleep(5000);
	TakesScreenshot tk = (TakesScreenshot) driver;
	File screen1 = tk.getScreenshotAs(OutputType.FILE);
	File save = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\Dropdown.png");
	FileUtils.copyFile(screen1, save);
	Thread.sleep(4000);
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(8000);
	
	File screen2 = tk.getScreenshotAs(OutputType.FILE);
	File save1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\signin.png");
	FileUtils.copyFile(screen2, save1);
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2F&rd");
	
	Thread.sleep(3000);
	File screen3 = tk.getScreenshotAs(OutputType.FILE);
	File save2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\pincode.png");
	FileUtils.copyFile(screen3, save2);
	
	
	 
}
}
