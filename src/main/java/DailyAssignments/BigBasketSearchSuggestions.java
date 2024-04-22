package DailyAssignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketSearchSuggestions {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("orange");
		
		By  searckLocator = By.xpath("(//input[@placeholder='Search for Products...'])[2]");
		
		//List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@class='overscroll-contain']/li"));

		
		By searchSuggestions = By.xpath("//ul[@class='overscroll-contain']/li");
				
		doSearchsuggestions(searckLocator, searchSuggestions, "orange", "Orange - Kinnow (Loose)");		
		
		
//		System.out.println(searchSuggestions.size());
//		
//		for(WebElement e: searchSuggestions) {
//			String text =e.getText();
//			System.out.println(text);
//			String[] split =  text.split("Add");
//			System.out.println(split.length);
//			System.out.println(split[0]);
//			System.out.println(Arrays.toString(split));
			
//			if(text.contains("Nagpur")) {
//				e.click();
//			}
//		}
//		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doSearchsuggestions(By locator, By searchSuggestions, String searchkey, String value) throws InterruptedException {
		
		getElement(locator).sendKeys(searchkey);
		
		Thread.sleep(3000);
		
		List<WebElement> suggList = getElements(searchSuggestions);

	   Thread.sleep(3000);
	   for(WebElement e : suggList) {
		  String text =  e.getText();
		  System.out.println(text);
		  if(text.equals(value)) {
			  e.click();
			  break;
		  }
	   }
	   
	   
	}

}
