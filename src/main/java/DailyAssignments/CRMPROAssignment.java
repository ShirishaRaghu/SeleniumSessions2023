package DailyAssignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CRMPROAssignment {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.findElement(By.xpath("//a[text()='Josh Buttler']//ancestor::tr/td/input[@type='checkbox']")).click();
		
		WebElement records = driver.findElement(By.name("do_action"));
		
		Select select = new Select(records);
		
		select.selectByValue("DELETE");
		
		driver.findElement(By.cssSelector("input[value='DO']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		
		WebElement category = driver.findElement(By.name("cs_category"));
		
		Select selectt = new Select(category);
		
		List<WebElement> categoryList = selectt.getOptions();
		System.out.println(categoryList.size());
		
		for(WebElement e : categoryList) {
			String text1 = e.getText();
			System.out.println(text1);
			if(text1.contains("Contact")) {
				e.click();
			}
		}
		
		
	}

}
