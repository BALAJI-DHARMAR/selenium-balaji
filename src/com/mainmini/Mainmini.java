package com.mainmini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Mainmini {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.addArguments("incognito");
	WebDriver driver = new ChromeDriver(op);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("email_create")).sendKeys("bodibalaji95@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.name("customer_firstname")).sendKeys("Balaji");
	driver.findElement(By.id("customer_lastname")).sendKeys("Soundravel");
	driver.findElement(By.id("passwd")).sendKeys("7904547505");
	WebElement da = driver.findElement(By.id("days"));
	Select s= new Select(da);
	s.selectByValue("19");
	WebElement mon = driver.findElement(By.id("months"));
	Select t = new Select(mon);
       t.selectByValue("2");
       WebElement yea = driver.findElement(By.id("years"));
       Select u = new Select(yea);
       u.selectByValue("1995");
       driver.findElement(By.id("newsletter")).click();
       driver.findElement(By.name("optin")).click();
       driver.findElement(By.id("firstname")).sendKeys("Balaji");
    	driver.findElement(By.name("lastname")).sendKeys("Dharmar Soundravel");
    	driver.findElement(By.id("company")).sendKeys("Dharmar pvt Ltd");
    	driver.findElement(By.id("address1")).sendKeys("Anna Street");
    	driver.findElement(By.id("address2")).sendKeys("Mambalam");
    	driver.findElement(By.id("city")).sendKeys("T Nagar");
    	WebElement sta = driver.findElement(By.id("id_state"));
    	Select v = new Select(sta);
    	v.selectByVisibleText("Delaware");
    	driver.findElement(By.id("postcode")).sendKeys("19706");
    	WebElement coun = driver.findElement(By.id("id_country"));
    	Select w = new Select(coun);
    	w.selectByVisibleText("United States");
    	driver.findElement(By.id("phone_mobile")).sendKeys("7904547505");
    	driver.findElement(By.id("alias")).sendKeys("  vinayga Illam ");
    	driver.findElement(By.id("submitAccount")).click();
    	
    
    	
    		
       
	
	
	
	
}
}
