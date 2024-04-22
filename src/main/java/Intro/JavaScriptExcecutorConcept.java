package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorConcept {

	public static void main(String[] args) {

		//browser : JS
		//JS --> JavaScript --> executeScript()
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		//Interface to Interface casting
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		String title = js.executeScript("return document.title;").toString();	
//	    System.out.println(title);
//
//		String url = js.executeScript("return document.URL").toString();
//		System.out.println(url);

		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver, js);
		String title  = jsUtil.getTitleByJS();
		System.out.println(title);
//         
//		jsUtil.goBackJS();//Go to back 
//		
//		jsUtil.goForwardJS();//Go to forward
//		
//		jsUtil.refreshBrowserJS();//Refresh browser
		
		//jsUtil.generateAlert("You are succesfully Login");
		
		//jsUtil.generateConfirmPopUp("Are you sure you want to Logout");
		
		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Print & SMS")) {
//			System.out.println("PASSs");
//		}
		
		
		
//		WebElement header = driver.findElement(By.xpath("//h3[text()='Deals & Sales Pipeline']"));
//		jsUtil.scrollIntoView(header);

		WebElement userID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));

		
		
		
		//jsUtil.drawBorder(header);
		jsUtil.flash(userID);
		userID.sendKeys("testing@gmail.com");
		jsUtil.flash(password);
		password.sendKeys("testing@123");
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		jsUtil.clickElementByJS(loginBtn);
		
		
	}

}
