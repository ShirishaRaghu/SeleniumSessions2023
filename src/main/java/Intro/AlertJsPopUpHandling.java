package Intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUpHandling {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//alert
		//prompt
		//confirm
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		//alert.dismiss();
		
		//It will automatically switch back to main frame
		
		//2. confirm
//		driver.findElement(By.xpath(""));
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//
//		alert.accept();//click ok

		//3. prompt
//		driver.findElement(By.xpath(""));
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.sendKeys("naveen");
//		Thread.sleep(5000);
//
//        alert.accept();//click ok

		
		
	}

}
