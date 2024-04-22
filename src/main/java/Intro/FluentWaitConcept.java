package Intro;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		//wait(I) : until(); --> FluentWait(C) : until(){} + other methods --> WebDriverWait(C)
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		By image = By.cssSelector("div#imageTemplateContainer img");
		
		//FW:
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                         .withTimeout(Duration.ofSeconds(10))
				                         .pollingEvery(Duration.ofSeconds(2))
				                         .ignoring(NoSuchElementException.class)
				                         .ignoring(ElementNotInteractableException.class)
				                         .withMessage("time out...element is not present...");
		
		
		WebElement image_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
		
		image_ele.click();
		
		//
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				                     .withTimeout(Duration.ofSeconds(10))
				                     .pollingEvery(Duration.ofSeconds(2))
				                     .ignoring(NoAlertPresentException.class)
				                     .withMessage("time out...alert is not present...");
		
		
		//WeDriverWait withFluentWait Features:
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(2))
//		     .ignoring(NoSuchElementException.class)
//		      .withMessage("time out...element is not present...");
		
//WebElement image_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(image));
//		
//		image_ele.click();

		
	}

}
