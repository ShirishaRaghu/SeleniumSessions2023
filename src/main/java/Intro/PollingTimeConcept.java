package Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//intervel time = 500ms(default)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(2000));//intervel time = 2000ms
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(twitter)).click();
		
	}

}
