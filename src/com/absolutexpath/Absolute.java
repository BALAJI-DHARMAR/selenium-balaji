package com.absolutexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Absolute {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("incognito");
		WebDriver driver = new ChromeDriver(chr);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=shoes+for+boys&crid=Q0M6V729W01Q&ref=nb_sb_ss_ts-doa-p_4_5");
//		driver.get("https://www.amazon.in/s?k=badminton+racket&crid=3OJ866OQ685VT&ref=nb_sb_ss_ts-doa-p_2_5");
//		WebElement absolute = driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[6]/div/span/div/div/div/div/span/a/div/img"));
//		absolute.click();
		
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.getElement", args)
		
		Thread.sleep(3000);
		WebElement dod = driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div/span/div/div/div/div[2]/div[2]/div/div/div/div/div/a[2]/div"));
		dod.click();
		
		
		
		
	}

}
