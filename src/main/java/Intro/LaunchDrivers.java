package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();// sid: 123
		driver.get("https://www.google.com");// sid: 123
		String title = driver.getTitle();// sid: 123
		System.out.println("Page title: " + title);

		String url = driver.getCurrentUrl();// sid: 123
		System.out.println(url);
		
		driver.quit();//sid: 123
		
		//re assigning driver
		driver = new ChromeDriver();
		driver.get("https://www.google.com");//sid: 456 -- new sid
		String title1 = driver.getTitle();//sid: 456
		System.out.println("page title: " + title);
		
		driver.quit();//sid: 456
	}

}
