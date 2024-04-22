package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://");
		
		int rowCount = driver.findElements(By.xpath("")).size();
		System.out.println("total rows " + (rowCount-1));
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr";
		
		
		
		
		
	}

}
