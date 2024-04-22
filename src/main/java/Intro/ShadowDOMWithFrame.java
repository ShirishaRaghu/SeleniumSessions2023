package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMWithFrame {

	public static void main(String[] args) throws InterruptedException {

		// https://selectorshub.com/xpath-practice-page/

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);

//		sc1: B --> p --> shadowDOM(open) -- element
//		String search_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement pizzaName = (WebElement) js.executeScript(search_script);
//         //Here selenium not undersatnds HTML element so typecast to WebElement
//		
//		pizzaName.sendKeys("Veg pizza");
		
		
		//Browse -- shadow DOM(open) ---> iframe ---element 
         String frame_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
         JavascriptExecutor js = (JavascriptExecutor) driver;
         WebElement frame_Element = (WebElement) js.executeScript(frame_script);

		
		driver.switchTo().frame(frame_Element);
		driver.findElement(By.id("glaf")).sendKeys("PASS");
		
		
		
		
		
		
		
	}

}
