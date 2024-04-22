package DailyAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// driver.findElement(By.xpath("//input[@name='q']")).click();

		By searchLocator = By.xpath("//input[@name='q']");

		

		By searchSuggestions = By.xpath("//form[@action='/search']//li");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> suggestions = wait
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchSuggestions));
		
		doGetSearchSuggestions(searchLocator, searchSuggestions, 10, "shirts");

//		System.out.println(suggestions.size());
//		
//		for(WebElement e : suggestions) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("shirts")) {
//				e.click();
//				break;
//				
//			}
//		}
//		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void doGetSearchSuggestions(By searchLocator, By searchSuggestions, int timeOut, String value) {
		getElement(searchLocator).click();
		List<WebElement> suggestions = waitForElementsVisible(searchSuggestions, timeOut);

		System.out.println(suggestions.size());

		for (WebElement e : suggestions) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;

			}
		}

	}

}
