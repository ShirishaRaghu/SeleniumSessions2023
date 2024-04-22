package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String pWID = driver.getWindowHandle();
		
		//selenium 4.x
		driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.TAB);
		

		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.close();//close google tab
		
		driver.switchTo().window(pWID);
		
		System.out.println(driver.getTitle());
		
		
	}

}
