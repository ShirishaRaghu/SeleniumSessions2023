package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trail/");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		Select select = new Select(country);
//		
//		select.selectByIndex(5);
//		select.selectByVisibleText("India");// NoSuchElementException
//		select.selectByValue("Australia");

//		By country = By.id("Form_getForm_Country");
//		doSlectByIndex(country, 5);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSlectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSlectByIndex(By locator, String value) {

		if (value == null || value.length() == 0) {
			 throw new MyElementException(value + " ---- value text can not be null or blank");
		}
        Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSlectByVisibleText(By locator, String visibleText) {
		if (visibleText == null || visibleText.length() == 0) {
			throw new MyElementException(visibleText + "visible text cannot be null or blank");
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

}
