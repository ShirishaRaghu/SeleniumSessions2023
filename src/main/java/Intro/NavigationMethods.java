package Intro;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
	
		//back and forward
		//get vs to
		//refresh method
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(new URL("https://www.google.com"));
		//driver.navigate().to("https://www.google.com/");

		driver.get("https://naveenautomationlabs.com/opencart/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/");
        
		String google=driver.getTitle();
				
		System.out.println(google);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(google);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		//refresh the page
		
		driver.navigate().refresh();
		
	}

}
