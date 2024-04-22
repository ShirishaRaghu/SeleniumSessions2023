package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// text --> getText()
		//attribute --> getAttribute()

		// get all the links
		// capture href value

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//
//		System.out.println(fn_placeholder);
//		System.out.println(fn_type);
//		System.out.println(fn_name);

		By firstname = By.id("input-firstname");
		By registerLink = By.linkText("Register");
		By contactUs = By.linkText("Contact Us");
		
		EllementUtil eleUtil = new EllementUtil(driver);


		String fn_placeholder = eleUtil.doElementGetAttribute(firstname, "placeholder");
		System.out.println(fn_placeholder);

		String regitration_href = eleUtil.doElementGetAttribute(registerLink, "href");
		System.out.println(regitration_href);
		
		String contact_us = eleUtil.doElementGetAttribute(contactUs, "href");
		System.out.println(contact_us);

		// driver.findElements(By.tagName(null))
	}

	}
