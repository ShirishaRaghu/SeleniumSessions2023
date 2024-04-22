package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("")).sendKeys("");

		driver.switchTo().frame("mainpanel");

		// always go to UI text not DOM text
		driver.findElement(By.linkText("CONTACTS")).click();

	}

	public static void selectContact(String conatactName) {
String xpath = "";
driver.findElement(By.xpath(xpath)).click();
	}

	public static String selectCompName(String conatactName) {

	String xpath= "//a[text()='Joe Root']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static void getPhoneNumbert(String conatactName) {

	}

//	public static void selectContact(String conatactName) {
//
//	}

}
