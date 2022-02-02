package com.absolutexpath;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brokenlinks {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
	
	ChromeOptions s = new ChromeOptions();
	ChromeOptions ops = s.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ops);
	driver.get("https://www.amazon.in/");
	
	List<WebElement> link = driver.findElements(By.tagName("a"));
	int size = link.size();
	System.out.println(size);
	for (int i = 0; i < size; i++) {
		WebElement webElement = link.get(i);
		String attribute = webElement.getAttribute("href");
		System.out.println(attribute);
		
//		URL links = new URL(attribute);
//		URLConnection openConnection = links.openConnection();
//		HttpURLConnection ref = (HttpURLConnection) openConnection ;
//		Thread.sleep(4000);
//		ref.connect();
//		int response = ref.getResponseCode();
//		if (response>= 400) {
//			System.out.println("the broken links: "+attribute);
//		}
//		else {
//			System.out.println("valid link:"+attribute);
//		}
	}
	
}
	
}
