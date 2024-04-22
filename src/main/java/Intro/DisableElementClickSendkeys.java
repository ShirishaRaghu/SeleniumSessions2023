package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendkeys {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

//		driver.findElement(By.id("pass")).click();//no exception
//	
//		driver.findElement(By.id("pass")).sendKeys("testing");//ElementNotInteractableException

		//driver.findElement(By.id("fname")).sendKeys(null);// IllegalArguementException: keys to send should be a not
															// null a null CharSequnce
		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
		
		driver.findElement(By.id("fname")).sendKeys(sb, s, "naveen");
		
		//CharSequence -- interface
		//String, SBuilder, SBuffer
		
	}

}
