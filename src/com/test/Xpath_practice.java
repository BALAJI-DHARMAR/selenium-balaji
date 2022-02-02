package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.get("https://www.google.com/search?q=amazon&sxsrf=AOaemvItJq9Em115NF6qh2ghjym25HV9_A%3A1632661034716&source=hp&ei=Km5QYfXOKd7Z1sQPqZWF8AQ&iflsig=ALs-wAMAAAAAYVB8OrfQCuLGmfh_kFiYyamVGv7fTz60&gs_ssp=eJzj4tDP1TfITc9OV2A0YHRg8GJLzE2sys8DAELoBhw&oq=Ama&gs_lcp=Cgdnd3Mtd2l6EAEYADIUCC4QgAQQsQMQgwEQxwEQ0QMQkwIyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQgwEyCAgAELEDEIMBMg4ILhCABBCxAxDHARCjAjIICAAQsQMQgwEyCAgAEIAEELEDMgUILhCABDIFCAAQgAQ6BwgjEOoCECc6DQguEMcBEKMCEOoCECc6EQguEIAEELEDEIMBEMcBENEDOgkIIxAnEEYQ-QE6BAgjECc6CwguEIAEEMcBEKMCUIfcHljf5R5glvEeaAFwAHgAgAGMAYgB5AKSAQMxLjKYAQCgAQGwAQo&sclient=gws-wiz");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		driver.findElement(By.xpath("(//a[@tabindex='0'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@dir='auto'])[34]")).click();
		
		driver.findElement(By.xpath("//h2[@dir='auto']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='averageCustomerReviews']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		
	}
	
}
