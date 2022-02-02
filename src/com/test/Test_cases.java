package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_cases {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String t = driver.getTitle();
	System.out.println(t);
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
	driver.navigate().to("https://www.youtube.com/");
	
	String ti = driver.getTitle();
	System.out.println(ti);
	
	driver.navigate().back();
	driver.navigate().forward();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
}

}
