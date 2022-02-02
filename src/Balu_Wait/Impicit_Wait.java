package Balu_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Impicit_Wait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\newdriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		ChromeOptions ag = co.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ag);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		WebElement input = driver.findElement(By.id("email"));
		input.sendKeys("mathi is winner");
	}
	
	
 
}
