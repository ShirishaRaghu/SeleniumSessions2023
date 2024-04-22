package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));

		Select select = new Select(dropDownEle);

		List<WebElement> getAllOptions = select.getOptions();

		for (WebElement e : getAllOptions) {
			String text = e.getText();
			System.out.println(text);

		}

//		for (WebElement e : printSelected) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		System.out.println(select.isMultiple());// true

		if (select.isMultiple()) {
			System.out.println("multi select is possible");
			select.selectByValue("Andean");
			select.selectByValue("Chilean");
			select.selectByValue("Greater");
			select.selectByValue("James's");
		}

	System.out.println("-------------Print Selected Text---------");
		
		
		
		List<WebElement> printSelected = select.getAllSelectedOptions();

		for (WebElement e : printSelected) {
			String text = e.getText();
			System.out.println(text);

		}

		select.deselectByValue("Greater");
		select.deselectAll();

	}

}
