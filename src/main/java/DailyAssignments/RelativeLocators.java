package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
//		String text = driver.findElement(with(By.tagName("a")).near(register)).getText();
//		System.out.println(text);
		
		WebElement policy = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		String text = driver.findElement(with(By.xpath("//b[text()='Privacy Policy']")).toRightOf(policy)).getText();
		System.out.println(text);
		
	}

}
