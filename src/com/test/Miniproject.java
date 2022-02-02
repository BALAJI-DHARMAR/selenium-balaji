package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions op = new ChromeOptions();
	op.addArguments("incognito");
	WebDriver driver =new  ChromeDriver(op);
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Thread.sleep(3000);
     driver.findElement(By.xpath("(//b[@class='caret'])[1]")).click();
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//a[contains(text(),'Select')][1]")).click();
	 
	
	Thread.sleep(4000);
	
	WebElement sun = driver.findElement(By.id("select-demo"));
	Select s = new Select(sun);
	s.selectByVisibleText("Sunday");
	boolean mul = s.isMultiple();
	System.out.println(mul);
	 Thread.sleep(3000);
	 
	WebElement su = driver.findElement(By.name("States"));
	Select s1 = new Select(su);
	s1.selectByVisibleText("California");
	boolean tr = s1.isMultiple();
	System.out.println(tr);
	 
	s1.selectByVisibleText("Florida");
	s1.selectByVisibleText("New York");
	s1.selectByVisibleText("Ohio");
	Thread.sleep(3000);
	s1.deselectByVisibleText("New York");
	List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	
	for (WebElement webElement : allSelectedOptions) {
		System.out.println(webElement.getText());
	}
	
}
}
