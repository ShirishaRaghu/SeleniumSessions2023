
package DailyAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		// Is to print all the links in the register page from login to newsletter

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> allLinks = driver.findElements(By.className("list-group-item"));

		System.out.println(allLinks.size());

		// Iterate through every link and get links and get Text

		for (int i = 0; i < allLinks.size(); i++) {
			String totalLinksText = allLinks.get(i).getAttribute("href");
			String linksText = allLinks.get(i).getText();

			if (linksText.length()!= 0) {
				// System.out.println(linksText);
				System.out.println(totalLinksText);
				System.out.println(linksText);

			}
		}
	}

}
