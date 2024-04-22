package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// chrome dev tools:
		// DOM: HTML: Document Object Model

		// create a webelement + perform an action on it(click, sendkeys, isDisplayed)
                
		// By -- Class name
		// Id -- static method

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		// 10 elements
		// 4 elements
		// ---------------------------conclusion----------
		// conclusion-- Find all the webelements & store it in WebElement with some
		// reference variable
		// Whenever it required to senkeys just send it

		// Drawback-- Everytime it hits the server(driver.findElement)
		// performance issue

		// 3.By locator
//		By username = By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		
//		WebElement emailId=driver.findElement(username);
//		WebElement password=driver.findElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		// ------------conclusion----------------
		// create By approach --> store in By with variable name
		// store in WebElement
		// send keys

		// 4.By locator with some utility
//		By username = By.id("input-email");
//		By pwd=By.id("input-password");
//
//		WebElement emailId=getElement(username);
//		WebElement password=getElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");

		// 5. By locator with element util and action util:
//		By username = By.id("input-email");
//		By pwd=By.id("input-password");
//
//		doSendkeys(username, "test@gmail.com");
//		doSendkeys(pwd, "test@123");

		// 6. By locator and create a common util class for elements:
		// Page By locators: OR - Object Repository
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		EllementUtil eleUtil = new EllementUtil(driver);
//		eleUtil.doSendkeys(username, "test@gmail.com");
//		eleUtil.doSendkeys(pwd, "test@123");

		// 7. BrUtil + eleUtil

		// 8. By util + String locators
		
		String username_id = "input-eamil";
		String pwd_id = "input-password";
		
		EllementUtil eleUtil = new EllementUtil(driver);

		eleUtil.doSendkeys("id", username_id, "anu@gmail.com");
		eleUtil.doSendkeys("id", pwd_id, "anu@123");
		
		//String --> by --> WebElement -- action -- 2nd
		//by -- webelement -- action -- 1st
		//webelement -- action -- 3rd
	}

//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSendkeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
}
