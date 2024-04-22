package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// create a webelement + perform an action on it(click, sendkeys, isDisplayed)

		// 1. id -- unique attribute: cannot be unique
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2. name: can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("test");
//		driver.findElement(By.className("lastname")).sendKeys("automation");

//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		
//		EllementUtil eleUtil = new EllementUtil(driver);
//		eleUtil.doSendkeys(fn, "test");
//		eleUtil.doSendkeys(ln, "automation");
		
		//By Strings:*************check it**********
//		String fn = "input-firstname";
//		String ln = "input-lastname";
//		
//		EllementUtil eleUtil = new EllementUtil(driver);
//		eleUtil.doSendkeys("id", fn, "siri");
//		eleUtil.doSendkeys("id", ln, "R");
		

		// 3. class name: its not unique attribute, can be duplicate -- Its a cascading style sheet 
		// driver.findElement(By.className("form-control")).sendKeys("testing");

		// 4. xpath: its not an attribute, address of WebElement in entire HTML DOM
		// XML PATH
		// driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("test");
		
		
		//Strings
		String fn = "//*[@id=\"input-firstname\"]";
		String ln = "//*[@id=\"input-lastname\"]";
		
		EllementUtil eleUtil = new EllementUtil(driver);
		eleUtil.doSendkeys("xpath", fn, "siri");
		eleUtil.doSendkeys("xpath", ln, "R");
		

//		By fn = By.xpath("//*[@id=\"input-firstname\"]");
//		EllementUtil eleUtil = new EllementUtil(driver);
//		eleUtil.doSendkeys(fn, "tseting");

		// 5. CSS - Cascading Style Sheet: its not an attribute
		// driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");

		// 6. linkText: only for Links : for the text of the link
		// html dom: <a> -- link
		// driver.findElement(By.linkText("Login")).click();

//		By loginLink = By.linkText("Login");
//		EllementUtil eleUtil = new EllementUtil(driver);
//		eleUtil.doClick(loginLink);

		// 7.PartialLinkText: only for links " for the partial text of the link

		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. tagname
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);

//		By pageHeader = By.tagName("h1");
//		EllementUtil eleUtil = new EllementUtil(driver);
//		String header = eleUtil.doGetElementText(pageHeader);
//		System.out.println(header);
	}

}
