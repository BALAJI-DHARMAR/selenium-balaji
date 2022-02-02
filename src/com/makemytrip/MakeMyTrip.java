package com.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newchrome\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		ChromeOptions inc = cop.addArguments("incognito");
		WebDriver driver = new ChromeDriver(inc);
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/");
		WebElement search_button = driver.findElement(By.xpath("//a[text()='Search']"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	executor.executeScript("arguments[0].scrollIntoView();", search_button);
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click;", search_button);

	}

}
