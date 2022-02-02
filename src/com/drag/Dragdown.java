package com.drag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Dragdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions w = new ChromeOptions();
		w.addArguments("incognito");
		WebDriver driver=new ChromeDriver(w);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/drop.html");
		Actions act = new Actions(driver);
		WebElement Dragg = driver.findElement(By.id("draggable"));
		
		WebElement Dropp = driver.findElement(By.id("droppable"));
		act.clickAndHold(Dragg).moveToElement(Dropp).release().build().perform();
		act.dragAndDrop(Dragg, Dropp);
		
	}

}
