package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// frame: webelemnt : DOM
		// need of frame : Data Security of webelement

		// Browser
		         // --Page : Webelement
		              // --Frame : Webelement

		// frame vs iframe

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
	}

}
