package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		ChromeOptions op = o.addArguments("incognito");

 		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		
		WebElement findElement = driver.findElement(By.id("ide"));
	
		Select s = new Select(findElement);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		System.out.println(options);
		
		
		
		
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}

}
