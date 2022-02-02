package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertchecking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("incognito");
		
		WebDriver driver= new ChromeDriver(p);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement Alertbox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		
		Alertbox.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String text = Alertbox.getText();
		System.out.println(text);
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		
		String text4 = confirmbox.getText();
		System.out.println(text4);
		confirmbox.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String text2 = confirmbox.getText();
		System.out.println(text);

		
		
		WebElement confirmbox2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirmbox2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		String text3 = confirmbox2.getText();
		System.out.println(text3);
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Hey.... dudes.....  Balaji D S");
		String Promptgettext = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		System.out.println("Its prompt gettext: "+Promptgettext);
	}
	
}
