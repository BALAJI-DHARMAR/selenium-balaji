package com.miniproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("incognito");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.get("https://www.google.com/search?q=instagram&sxsrf=AOaemvLsvd3PQ31kujhHx6a3WZ22Q_QcXw%3A1632980795873&source=hp&ei=O09VYZevMpDP1sQPo7ituAo&iflsig=ALs-wAMAAAAAYVVdS_7uVxqHnfOwzvcUD7oqWfynXPWz&oq=ins&gs_lcp=Cgdnd3Mtd2l6EAEYADILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyBQgAEIAEMggIABCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQ6BwgjEOoCECc6DQguEMcBENEDEOoCECc6BwguEOoCECc6DgguEIAEELEDEIMBEJMCOg4ILhCABBCxAxDHARDRAzoECCMQJzoRCC4QgAQQsQMQgwEQxwEQowI6CAguEIAEELEDULG9Klj_wypg6NgqaAFwAHgAgAGoAYgB4AKSAQMyLjGYAQCgAQGwAQo&sclient=gws-wiz");
	driver.findElement(By.xpath("//h3[text()='Instagram']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("emailOrPhone")).sendKeys("bodibalaji95@gmail.com");
	driver.findElement(By.name("fullName")).sendKeys("Balaji D S");
	driver.findElement(By.name("username")).sendKeys("baji_like_vikrams_hardwork");
	driver.findElement(By.name("password")).sendKeys("7904547505");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	
}
}
