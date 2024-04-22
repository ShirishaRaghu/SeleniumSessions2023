package testngsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Intro.EleException;





public class BaseTest {

	
	WebDriver driver;
	
	@Parameters({"url", "browser", "headless"})
	@BeforeTest
	public void setup(String url, String browserName, String headless) {
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
			co.addArguments("--headless");
			}
			
			driver = new ChromeDriver(co);
			break;
			
		case "firefox":
			
			FirefoxOptions eo = new FirefoxOptions();
			if(Boolean.parseBoolean(headless)) {
			eo.addArguments("--headless");
			}
			driver = new FirefoxDriver(eo);
			break;
			
		case "edge":
			
			EdgeOptions go = new EdgeOptions();
			if(Boolean.parseBoolean(headless)) {
			go.addArguments("--headless");
			}
			driver = new EdgeDriver(go);
			break;

		default:
			System.out.println("plz pass the right browser...." + browserName);
			throw new EleException("Browser not found");
			
		}
		
		
		
		
		driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterTest
	public void tearDown() {
	  driver.quit();	
	}
	
	
	
	
	
	
	//https://martinfowler.com/bliki/PageObject.html
	
	
}
