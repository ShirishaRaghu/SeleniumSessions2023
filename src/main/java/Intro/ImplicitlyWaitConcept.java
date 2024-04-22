package Intro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		//imp wait: Global wait: applied to all the elements by default
		//FE/FEs
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		//case 1;
//		//login page: 10
//		//total timeout = 10 secs
//		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("test");//el: 10 : 2 = 8 Ignored
//		//e2: 10
//		//e3: 10
//		//e4....en : 10
//		
//		//home page: 15 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
//		//he1: 15
//		//he2: 15
//		//logout: 15
//		
//		//login page: 15 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
//        //e1 e2 e3: 10 secs
//		
//		//reg page: 5 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
//
//		//cart page: 0 : nullify of imp wait: 0
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x
		
		
		//case 2:
		//login page: 10 secs
		//e1 : 10
		//e2 : 10
		//e2 : 10
		//e3 : 10
		
		
		//case 3:
		//its applicable for webelements
		//not applicable for non webelements: JS alerts, title, urls, browser window
		
		//avoid implicit wait in your real time fw
		
		
		
		//https://testng.org/testng-eclipse-update-site/7.9.0/
		//https://github.com/testng-team/testng-eclipse
		
	}

}
