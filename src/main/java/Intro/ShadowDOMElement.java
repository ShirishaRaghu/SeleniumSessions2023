package Intro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {

		//shadow-root(open): --> It is a container --> used for security -->should be in open state		
		WebDriver driver = new ChromeDriver();
        driver.get("chrome://settings/");
		Thread.sleep(2000);

		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
        //Here no need to write JS path Copy from Console
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement search = (WebElement)js.executeScript(search_script);

		search.sendKeys("notification");
		// driver.findElement(By.id("searchInput")).sendKeys("notifications");

	}

}
