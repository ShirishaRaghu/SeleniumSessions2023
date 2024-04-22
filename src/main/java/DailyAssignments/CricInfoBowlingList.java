package DailyAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoBowlingList {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

		
		driver.findElement(By.xpath("//span[text()='Marnus Labuschagne']//ancestor::tr"));
		
		System.out.println(doGetBowlerScorList("Minnu Mani"));

		System.out.println(doGetBowlerScorList("Arundhati Reddy"));
		
	}

	
	//https://www.espncricinfo.com/series/australia-in-new-zealand-2023-24-1388188/new-zealand-vs-australia-1st-test-1388226/full-scorecard
	// //span[text()='New Zealand']//following-sibling::span[text()='1st Innings']/ancestor::div[contains(@class,'ds-justify-center')]/../following-sibling::div//span[text()='Tom Latham']//ancestor::td/following-sibling::td
	
	public static List<String> doGetBowlerScorList(String userName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='" + userName
				+ "']//ancestor::td[@class='ds-flex ds-items-center']//following-sibling::td"));
		System.out.println(scoreList.size());

		List<String> scoreListOfBowler = new ArrayList<String>();

		for (WebElement e : scoreList) {
			String scoreCardList = e.getText();
			scoreListOfBowler.add(scoreCardList);
		}
		return scoreListOfBowler;

	}
	
	

}
