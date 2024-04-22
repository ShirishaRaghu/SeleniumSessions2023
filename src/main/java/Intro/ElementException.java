package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		// driver.findElement(By.name("search111")).sendKeys("macbook");
		// NoSuchElementException

		List<WebElement> eles = driver.findElements(By.tagName("naveen"));
		//Empty array list
		System.out.println(eles.size());
		System.out.println(eles);
	}

}
