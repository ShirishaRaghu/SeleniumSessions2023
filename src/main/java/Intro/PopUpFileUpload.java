package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpFileUpload {

	static WebDriver driver;

	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("");
		
		//type = file is mandatory
		
		//c:\\document\\test.txt -- windows
		driver.findElement(By.name("")).sendKeys("");
		
		
		
	}

}
