												
package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		By dropDown = By.id("justAnInputBox");

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// 1. tc_01: single selection
		 //selectChoice(dropDown, choices, "choice 2");

		// 2. tc_02: multi selection
		// selectChoice(dropDown, choices, "choice 1", "choice 3", "choice 4", "choice 6 2 2");

		// 3. tc_03: all selection

		selectChoice(dropDown, choices, "all");//instead of all we can write anything -- Its an indicator
		
		//...varargs -- spread parameters(JS) -- array
		
		System.out.println("hello");
	}
	
	/**
	 * This method is used to handle single, multiple and all selections. Please pass 'all' in case of all selection
	 * @param dropDownLocator
	 * @param choices
	 * @param value
	 * @throws InterruptedException
	 */

	public static void selectChoice(By dropDownLocator, By choices, String... value) throws InterruptedException {

		driver.findElement(dropDownLocator).click();

		Thread.sleep(3000);

		List<WebElement> choicesList = driver.findElements(choices);// 44

		if (!value[0].equals("all")) {
			System.out.println(choicesList.size());

			for (WebElement e : choicesList) {

				String text = e.getText();
				System.out.println(text);

				for (String v : value) {
					
					if (text.equals(v)) {
						e.click();
					}
				}

			}
		} else {
			// all selection logic:
			for (WebElement e : choicesList) {// 1 to 14
				try {
					e.click();
				} catch (ElementNotInteractableException ex) {
					//break;
				}
			}
		}

	}

}
