package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		//headless vs headed
		//headless: no browser visibility
		//faster
		//run tcs on CI CD/Jenkins/Linux: headless
		//recommended: not recommended
		//local: 
		//problems: its not an actual user simulation
		//complex apps/HTML DOM:
		//alerts/popups : could be a problem
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		
		//WebDriver driver = new ChromeDriver(co);
		
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		//fo.addArguments("--incognito");
		//WebDriver driver = new FirefoxDriver(fo);
		
		
		EdgeDriver eg = new EdgeDriver();
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		//headless options:
		//ghostdriver
		//phantomJS
		//htmlunitdriver
		
	}

}
