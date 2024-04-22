package Intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//1st: fetch the window ids
		
		//Set -- Non orderded based collection -- cannot have duplicate ids
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindow = it.next();
		System.out.println("parent window id :"+ parentWindow);
	
		String childWindow = it.next();
		System.out.println("parent window id :"+ childWindow);
	
		//2nd: switching work:
		
		driver.switchTo().window(childWindow);
		System.out.println("child window url : "+ driver.getCurrentUrl());
	
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindow);
		
		driver.quit();
		
		
		
	}

}
