package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();// default constructor launching browser
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page title: " + title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();// browser is closed
		// session is invalid with same id://NoSuchSessionException: invalid session id
         //sid = 123 -- invalid
		
		// driver.quit();//browser is closed
		// NoSuchSessionException: //session ID is null , using webdriver after calling
		// quit?
		//sid = null

		driver = new ChromeDriver();// open browser: new session id = 456
		driver.get("https://www.google.com");// enter url: 456

		System.out.println(driver.getTitle());// 456

	}

}
