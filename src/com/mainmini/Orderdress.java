package com.mainmini;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Orderdress {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("bodibalaji95@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("7904547505");
		WebElement Submitbutton = driver.findElement(By.id("SubmitLogin"));
		Submitbutton.click();
		
		Actions ac =new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	    ac.moveToElement(women).build().perform();
	    WebElement insidetshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		insidetshirt.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700);");
		    
		WebElement dressimage = driver.findElement(By.xpath("//img[@width='250']"));
		ac.moveToElement(dressimage).build().perform();
		WebElement Qucikviewaction = driver.findElement(By.xpath("//a[@class='quick-view']"));
		Qucikviewaction.click();
		       
        WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
        driver.switchTo().frame(frame);
		WebElement addtocard = driver.findElement(By.name("Submit"));
		addtocard.click();
		driver.switchTo().defaultContent();
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedtocheckout.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		WebElement proceed3 = driver.findElement(By.name("processAddress"));
		proceed3.click();
		
		WebElement agreebutton = driver.findElement(By.id("cgv"));
		agreebutton.click();
		
		WebElement proceed4 = driver.findElement(By.name("processCarrier"));
		proceed4.click();
		
		WebElement paybycheck = driver.findElement(By.xpath("//a[@class='cheque']"));
		paybycheck.click();
		
		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		File occur = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\orderfinished.png");
		FileUtils.copyFile(screenshotAs, occur);
		
		
}
}