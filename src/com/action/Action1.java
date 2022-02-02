package com.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
	
	ChromeOptions cr = new ChromeOptions();
	cr.addArguments("incognito");
    WebDriver driver = new ChromeDriver(cr);  
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement flipkartpopupclickbutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	flipkartpopupclickbutton.click();
	Actions act = new Actions(driver);
	Robot robo = new Robot();
	//-------
	WebElement topoffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
	act.contextClick(topoffers).build().perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	//-------
	WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));	
	act.contextClick(grocery).build().perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	//---------------
	WebElement mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
	act.contextClick(mobiles).build().perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	Set<String> alltapdetails = driver.getWindowHandles();
	for (String string : alltapdetails) {
		System.out.println(driver.switchTo().window(string).getTitle());
	}
	
	
	String onetapdetailsofgrocery = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
	for (String multiplewindow : alltapdetails) {
		if (driver.switchTo().window(multiplewindow).getTitle().equals(onetapdetailsofgrocery)) {
			break;
		}
	}
	
	
	
}
}
