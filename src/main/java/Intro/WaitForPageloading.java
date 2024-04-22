package Intro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageloading {

	static WebDriver driver;
	
	public static void main(String[] args) {


	driver = new ChromeDriver();
	driver.get("https://classic.crmpro.com/");
	
	boolean flag = isPageLoaded(10);
	if(!flag) {
		throw new BrowserException("PAGE IS NOT LOADED");
	}
		
		
		
		
		
//		setTimeout(()=>{
//		    debugger ;
//		}
//		, 5000)
		
	}
	
	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String  flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === complete")).toString();//"true"
		return Boolean.parseBoolean(flag);//true
		
		
	}   

}

