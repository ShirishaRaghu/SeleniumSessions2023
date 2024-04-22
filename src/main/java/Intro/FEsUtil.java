package Intro;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://ascipgdm.in");

		By links = By.tagName("a");
		By images = By.tagName("img");

		
//		System.out.println("total images = " + getElementsCount(images));
//		System.out.println("total links = " + getElementsCount(links));
//
//		ArrayList<String> eleText = getElementsTextList(links);
//		System.out.println(eleText);
		
//		if(eleText.contains("Help")) {
//			System.out.println("PASS");
//		}
		
		
		ArrayList<String> eleAltValues = getAttribueList(images, "alt");
	    System.out.println(eleAltValues);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}

		return eleTextList;
	}
	
	public static ArrayList<String> getAttribueList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAtrrList = new ArrayList<String>();
		
		for(int i=0;i<eleList.size();i++) {
			String attrValue = eleList.get(i).getAttribute(attrName);
			if(attrValue.length()!=0) {
				eleAtrrList.add(attrValue);
			}
		}
		
		return eleAtrrList;
	}

}
