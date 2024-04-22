package DailyAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoUsingThreedot {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

//		List<WebElement> bowlers = driver.findElements(By.xpath(
//				"//span[text()='Marizanne Kapp']//ancestor::td[@class='ds-flex ds-items-center']//ancestor::tbody/tr"));

		By locator = By.xpath(
				"//span[text()='Marizanne Kapp']//ancestor::td[@class='ds-flex ds-items-center']//ancestor::tbody/tr");
		
		getBowlers(locator, "Marizanne Kapp", "Minnu Mani");

	}
	
	
	public static void getBowlers(By loactor, String...value) {
		
		List<WebElement> bowlers = driver.findElements(loactor);
		
		for (WebElement e : bowlers) {
			String text = e.getText();
			System.out.println(text);
			//e.click();
			
			
		}
		
	}
	
	//Ask naveen here how to use ...parameter
	


}
