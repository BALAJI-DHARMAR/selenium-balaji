package com.miniproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions c=new ChromeOptions();
	c.addArguments("incognito");
	
	WebDriver driver =new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
	driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	driver.findElement(By.name("firstname")).sendKeys("Balaji");
	driver.findElement(By.name("lastname")).sendKeys("gowri");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("7904547505");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("balaji95");
	Thread.sleep(4000);
	WebElement day = driver.findElement(By.id("day"));
	Select y = new Select(day);
	y.selectByValue("19");
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.id("month"));
	Select z = new Select(month);
	z.selectByVisibleText("Feb");
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.id("year"));
	Select x = new Select(year);
	x.selectByValue("1995");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	
	driver.findElement(By.name("websubmit")).click();
}
}
