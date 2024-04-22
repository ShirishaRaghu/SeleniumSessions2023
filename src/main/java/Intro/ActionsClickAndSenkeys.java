package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSenkeys {

static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    
	    By email = By.id("input-email");
	    By password = By.id("input-password");
	    By login = By.xpath("//input[@value='Login']");
	    
//	    Actions act = new Actions(driver);
//	    
//	    act.sendKeys(driver.findElement(email), "test@gmail.com").perform();
//	    act.sendKeys(driver.findElement(password), "test@123").perform();
//		act.click(driver.findElement(login)).click().perform();
		
	    doActionsSendkeys(login, "test@gmail.com");
	    doActionsSendkeys(password, "test@123");
	    doActionsClick(login);
	}

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
		
	}
	
	public static void doActionsSendkeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
	}
	
	
}
