package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//InvalidSelectorException: Compound class names not permitted
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen@gmail.com");
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("naveen@gmail.com");
		
		//NSE:
		//driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("test");
		
		//valid
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test");
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("test");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test");
		
		//valid
		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("test");

		driver.findElement(By.cssSelector("input private-form__control login-email")).sendKeys("test");

		
		//valid
		//driver.findElement(By.cssSelector("input.private-form__control.login-email")).sendKeys("test");

		driver.findElement(By.xpath("//input[@#@#@id='-12'username']")).sendKeys("test");
	}

}
