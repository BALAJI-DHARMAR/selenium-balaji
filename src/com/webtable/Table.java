package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {//1

	public static void main(String[] args) {//2
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
       
       ChromeOptions c = new ChromeOptions();
       c.addArguments("incognito");
       WebDriver driver = new ChromeDriver(c);
       
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       driver.get("http://www.leafground.com/pages/table.html");
       List<WebElement> alltabledata = driver.findElements(By.xpath("//table/tbody/tr/td"));
       for (WebElement webElement : alltabledata) {
		String text = webElement.getText();
		System.out.println(text);
       }
		System.out.println("This Table Size..... ");
       
		int size = alltabledata.size();
		System.out.println("Size= " + size);
		System.out.println("-------------------"); 
		
		List<WebElement> secondrow = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	       for (WebElement webElement2 : secondrow) {
	    	   String text2 = webElement2.getText();
	    	   System.out.println(text2);
	   
	       }
	       System.out.println("------------------Particular Data----------------");
	       
	       
	       WebElement particulardata = driver.findElement(By.xpath("//table//tbody/tr[5]/td[6]"));
	       System.out.println(particulardata.getText());
	}
}
	    	   
			
		
		
	
 
	


