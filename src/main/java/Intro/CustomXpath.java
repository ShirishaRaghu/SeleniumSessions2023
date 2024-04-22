package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https:www.amazon.com/");
		
		// Xpath: address of the element in the DOM
		// XMLPath
		// 1. absolute xpath - never use
		// 2. relative xpath(custom xpath)

		// 1. using single attr:
		// tagname[@attrname = 'value']
		// input[@id='input-email']

		// input[@name] --5
		// input[@value='Login'] --1

		// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

		// 2. using multiple attts: can use 'n' number of attr
		// tagname[@attr1='value' and @attr2='value' and @attr3='value']
		// tagname[@attr = 'value' or @attr = 'value']
		// tagname[@attr and @attr]
		// tagname[@attr]

		// input[@type='submit' and @value='Login'] --- 1
		// input[@type='submit'] -- 3
		// input[@type='text' or @type='Email'] --4
		// a[@href]

		// 3. text(): a function
		// tagname[text()='value']
		// h2[text()='New Customer']
		// a[text()='Desktops']

		// 4. text() and attribute:
		// tagname[@attr='value' and text()='value']
		// a[@class='dropdown-toggle' and text()='Desktops']
		// a[@class='dropdown-toggle' and text()='Desktops' and @data-toggle='dropdown']

		// 5. contains() with attr:
		// tagname[contains(@arrName, 'value')]
		// tagname[contains(@arrName, 'value') and @arrName2='value']
		// input[contains(@placeholder, 'E-Mail')]
		// input[contains(@placeholder, 'Address')]

		// tagname[contains(@arrName, 'value') and @attr2='value']
		// a[contains(@href, 'wishlist')]

		// dynamic ids:
		// <input id=firstname_123 />
		// <input id=firstname_345 />
		// <input id=firstname_900 />
		// <input id=firstname_987 />

		// input[contains(@id, 'firstname_')]

		// 6. contains with text()
		// p[contains(text(), 'Customer service, IT, and CRM software')]
//a[contains(text(), 'Customer')]

		// 7. contains() with text() and attr:
		// tagname[contains(text(), 'value') and contains(@attr,'value')]
        //a[contains(text(), 'Notebooks') and contains(@attr,'category&path')]
		
		// tagname[contains(text(), 'value') and contains(@attr1,'value') and
		// @attr2='value']

		// 8. starts-with():
		// tagname[starts-with(@attr, 'value')]
		// h2[starts-with(@placeholder,'E-Mail')]
		// [starts-with(@placeholder,'')]

		// 9. starts-with() with text():
		// tagname[starts-with(text(),'Forgotten')]

		// dynamic ids:
		// <input id=firstname_123_login />
		// <input id=123_firstname_login />

		// 10. ends-with() is not supported in xpath

		// 11. index based xpath:
		// (//tagname[text()='value'])[1]
		// (//tagname[text()='value'])[position()=1]
		// (//tagname[@attr='value'])(last)
		//(//a[@class=''list-group-item])[2]
		
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol navAccessibility')])[last()]//a)[last()]")).getText();

		//*
		//*[@id]
		//*[@class='form-control'] -- 100 -- 6
		//input[@class='form-control'] -- 20 -- 6
		
	}

}
