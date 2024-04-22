package Intro;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {

	static WebDriver driver; 
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
			element = driver.findElement(locator);
			System.out.println("element is found..." + locator + " in attempts " + attempts);
			break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found..." + "in attempts "+ attempts);
             try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			}
			attempts++;
		}
	
	
	if(element == null) {
		System.out.println("element is not found..... tried for " + timeOut + " times "+ " with the interval of "+ 500 + " milliseconds.... ");
	    throw new EleException("No such Element");
	}
	
	return element;

}
	
	public static WebElement retryingElement(By locator, int timeOut, int intervelTime) {
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
			element = driver.findElement(locator);
			System.out.println("element is found..." + locator + " in attempts " + attempts);
			break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found..." + "in attempts "+ attempts);
             try {
				Thread.sleep(intervelTime * 2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			}
			attempts++;
		}
	
	
	if(element == null) {
		System.out.println("element is not found..... tried for " + timeOut + " times "+ " with the interval of "+ intervelTime + " milliseconds.... ");
	    throw new EleException("No such Element");
	}
	
	return element;

}
	
	public static void main(String[] args) {


		//Thread.sleep -- static wait --> dynamic wait
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email1");
		//retryingElement(emailId, 10).sendKeys("kapil@gmail.com");
		
		retryingElement(emailId, 10, 2).sendKeys("kapil@gmail.com");
		
	}
	
	
	
	
}
