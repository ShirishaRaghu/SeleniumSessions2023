package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("total rows = " + (rowCount - 1));

		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("total columns :"+ colCount);
		
		// table[@id='customers']/tbody/tr[2]/td[1]
		// table[@id='customers']/tbody/tr[3]/td[1]
		// table[@id='customers']/tbody/tr[4]/td[1]
		// table[@id='customers']/tbody/tr[5]/td[1]

//		String beforeXpath = "//table[@id='customers']/tbody/tr[";
//		String afterXpath = "]/td[1]";
//
//		for (int row = 2; row <= rowCount; row++) {
//			String compXpath = beforeXpath + row + afterXpath;
//			//System.out.println(compXpath);
//			String text = driver.findElement(By.xpath(compXpath)).getText();
//			System.out.println(text);
//		}
//		
//		System.out.println("--------- second column---------");
//		
//		String beforeXpath1 = "//table[@id='customers']/tbody/tr[";
//		String afterXpath1 = "]/td[2]";
//		
//		for (int row = 2; row <= rowCount; row++) {
//			String compXpath = beforeXpath1 + row + afterXpath1;
//			//System.out.println(compXpath);
//			String text = driver.findElement(By.xpath(compXpath)).getText();
//			System.out.println(text);
//		}
//		
//		System.out.println("--------third column------");
//		
//		String beforeXpath2 = "//table[@id='customers']/tbody/tr[";
//		String afterXpath2 = "]/td[3]";
//		
//		for (int row = 2; row <= rowCount; row++) {
//			String compXpath = beforeXpath2 + row + afterXpath2;
//			//System.out.println(compXpath);
//			String text = driver.findElement(By.xpath(compXpath)).getText();
//			System.out.println(text);
//		}

		System.out.println("------print all table text--------");
		
//		List<WebElement> tableDataList = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
//		
//		for(WebElement e: tableDataList) {
//			System.out.println(e.getText());
//		}
		
		
		//th[text()='Company']/parent::tr/following-sibling::tr/td[2]
		//table[@id='customers']//tr/td[1]
		
		
		for(int col=1; col<=colCount; col++) {
			List<WebElement> colData = driver.findElements(By.xpath("//table[@id='customers']//tr/td["+colCount+"]"));
			for(WebElement e : colData) {
				System.out.println(e.getText());
			}
		}
		
	}

}
