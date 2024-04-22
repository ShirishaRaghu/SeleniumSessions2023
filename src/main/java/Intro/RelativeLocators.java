package Intro;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement ele = driver.findElement(By.id("input-email"));

		String text = driver.findElement(with(By.cssSelector("label[for='input-email']")).above(ele)).getText();
		System.out.println(text);

		WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement continueBtn = driver.findElement(By.linkText("Continue"));

		List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(continueBtn));

		for (WebElement e : paraList) {
			String text1 = e.getText();
			System.out.println(text1);
		}

		WebElement pass = driver.findElement(By.linkText("Forgotten Password"));

		driver.findElement(with(By.xpath("//input[@value='Login']")).below(pass)).click();

		WebElement returnText = driver.findElement(By.xpath("//Strong[contains(text(),'returning customer')]"));
		
		String customerHeading = driver.findElement(with(By.xpath("//h2[text()='Returning Customer']")).above(returnText)).getText();
		
		System.out.println(customerHeading);
		
		

	}

}
