package com.absolutexpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		ChromeOptions addArguments = c.addArguments("incognito");
		WebDriver driver = new ChromeDriver(addArguments);
        Thread.sleep(3000);
		WebElement dyna = driver.findElement(By.xpath("(//span[text()='₹27,000.00'])[2]//parent::span[1]/preceding::img[2]"));
		dyna.click();

	}

}
