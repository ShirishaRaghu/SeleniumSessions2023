package DailyAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchfield = By.name("q");
		Thread.sleep(3000);

		By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");

		doSearchSuggestions(searchfield, suggestions, "hdfc", "netbanking");
		
	}
	
	
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	

	public static void doSearchSuggestions(By searchlocator, By searchsuggestions, String searchkey, String value) throws InterruptedException {

		getElement(searchlocator).sendKeys(searchkey);
		Thread.sleep(3000);

		List<WebElement> searchList = getElements(searchsuggestions);

		System.out.println(searchList.size());

		for (WebElement e : searchList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}

		
		
	}

}
