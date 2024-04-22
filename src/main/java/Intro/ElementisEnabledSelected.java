package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisEnabledSelected {

	static WebDriver driver;

	public static void main(String[] args) {

		// isDisplayed -- element is present on the page
		// isEnabled -- element is obviously present on the page but its enabled or not

		driver = new ChromeDriver();
		driver.get("https:classic.freecrm.com/register/");

		
		boolean f1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(f1);//true
		boolean f2=driver.findElement(By.id("agreeTerms")).isDisplayed();
		System.out.println(f2);//true
		
		
		
		
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);// false

		boolean chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);// false

		driver.findElement(By.name("agreeTerms")).click();// select the check box

		chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);// true

		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);// true
	}

}
