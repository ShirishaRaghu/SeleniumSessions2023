package Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Wait(I) : until(); --> FluentWait(C): (@override)until(){} + other methods --> WebDriverWait(C): no methods

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By fullName = By.id("Form_getForm_FullName");
		By bussEmail = By.id("Form_getForm_Email");
//		waitForElementPresence(fullName, 10).sendKeys("naveen");
//		getElement(bussEmail).sendKeys("naveen@gmail.com");
		
		waitForElementVisible(fullName, 10).sendKeys("naveen");
		
		
		//e1: 10 secs
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement fullName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//		fullName_ele.sendKeys("testing");
//		
//		//e2: 0
//		driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com");
		
		
		
		
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	/**
	 *An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
