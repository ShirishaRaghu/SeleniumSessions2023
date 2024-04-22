package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/live-cricket-score");
		
//		WebElement teams =driver.findElement(By.xpath("//a[text()='Teams']"));
//		Thread.sleep(1000);
//
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(teams).perform();
// 		Thread.sleep(1000);
// 		act.moveToElement(driver.findElement(By.xpath("//span[text()='Australia']"))).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Nepal']")).click();
 		
		By parent = By.xpath("//a[text()='Teams']");
		By subMenu = By.xpath("//span[text()='Australia']");
		
		By sebMenu2 = By.xpath("//span[text()='Nepal']");
		
		
		getMenuSubMenu3(parent, subMenu, sebMenu2);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void getMenuSubMenu3(By parentMenu, By subMenu1, By subMenu2) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		
		act.moveToElement(getElement(subMenu1)).build().perform();
		Thread.sleep(2000);

		getElement(subMenu2).click();
		
		
	}

}
