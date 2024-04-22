package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownWithioutSingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https");

		// not allowed to use select class

		By options = By.xpath("//select[@id='Form_getForm_Country']");
		List<WebElement> optionsList = driver.findElements(options);

			}
	
	
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	
	public static void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}

		}


		
	}

}
