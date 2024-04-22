package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openCartLoginTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		EllementUtil eleUtil = new EllementUtil(driver);
		eleUtil.doSendkeys(username, "Shweta@gmail.com");
		eleUtil.doSendkeys(password, "shweata@123");
		
		//brUtil.closeBrowser();
		
		
	}

}
