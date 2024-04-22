package Intro;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAccess {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// parent to direct child: /
		// form/div/input

		// parent to direct + indirect child: //

		// child to parent: --/parent::
		// input[@id='input-email']/../../../..
		// input[@id='input-email']/parent::div/parent::form

		// child to grandparent: --/ancestor::
		// input[@id='input-email']/ancestor::form

		// a[text()='Recurting payments']/ancestor::aside

		// above sibbling--preceeding siblling
		// a[text()='Recurting payments']/preceeding-sibling::a[text()='Downloads']

		// below sibbling--folloein sibbling
		// a[text()='Recurting payments']/following-sibbling::[text()='Returns']
		// (//a[text()='Recurting payments']/following-sibbling::a)[2]

		// input[@id='input-email']/preceeding-sibling::label

		// a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']
		// a[text()='Joe.Root']/parent::td/preceeding-sibling::td/input[@type='checkbox']
		// a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']

	}

		
	public static List<String> getUserDetails(String userName) {
		String xpath = "";
		List<WebElement> userInfoEles= driver.findElements(By.xpath(xpath));
		List<String> userInfoList = new ArrayList<String>();
		
		for(WebElement e: userInfoEles) {
			String text = e.getText();
			userInfoList.add(text);
		}
		return userInfoList;
	}

	//Apiautomation/Selenium@12345
	//https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard
}
