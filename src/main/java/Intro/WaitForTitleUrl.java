package Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		
		//System.out.println(driver.getTitle());
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Free CRM software customer relatinship"));
//		System.out.println(driver.getTitle());
		
		String title = waitForTitleContains("facebook is good", 10);
         System.out.println(title);
         
         driver.findElement(By.linkText("Sign Up")).click();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.urlContains("/register"));
         System.out.println(driver.getCurrentUrl());
         
         
         
         
	}
	
	public static String waitForURLContains(String URLFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(URLFraction))){
		System.out.println(driver.getTitle());
		}
		}catch(Exception e) {
			System.out.println("URL fraction  is not found within : " + timeOut);
		}
		
		return null;
		
	}
	
	public static String waitForURLIs(String URL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlToBe(URL))){
		System.out.println(driver.getTitle());
		}
		}catch(Exception e) {
			System.out.println("URL  is not found within : " + timeOut);
		}
		
		return null;
		
	}

	

	
	public static String waitForTitleContains(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleIs(title))){
		System.out.println(driver.getTitle());
		}
		}catch(Exception e) {
			System.out.println("title fraction is not found within : " + timeOut);
		}
		
		return null;
		
	}

	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleIs(title))){
		System.out.println(driver.getTitle());
		}
		}catch(Exception e) {
			System.out.println("title is not found within : " + timeOut);
		}
		
		return null;
		
	}
	
}
