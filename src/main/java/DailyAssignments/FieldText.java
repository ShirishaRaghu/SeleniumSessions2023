package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Intro.EllementUtil;
import Intro.StringUtils;

public class FieldText {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By phoneNumber = By.id("input-telephone");
		By pssword = By.id("input-password");
		By conformPassword = By.id("input-confirm");

		EllementUtil eleUtil = new EllementUtil(driver);

		eleUtil.doSendkeys(firstName, "siri");
		eleUtil.doSendkeys(lastName, "R");
		eleUtil.doSendkeys(emailId, StringUtils.getRandomEmail());
		eleUtil.doSendkeys(phoneNumber, "2345617896");
		eleUtil.doSendkeys(pssword, "siri@123");
		eleUtil.doSendkeys(conformPassword, "siri@123");
		
				
		String fnValue = driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(fnValue);
		
		String lastValue = driver.findElement(By.id("input-lastname")).getAttribute("value");
		System.out.println(lastValue);

		String emailIdValue = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(emailIdValue);

		String phoneNumberValue = driver.findElement(By.id("input-telephone")).getAttribute("value");
		System.out.println(phoneNumberValue);
		
		String passwordValue = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println(passwordValue);

		String conformPasswordValue = driver.findElement(By.id("input-confirm")).getAttribute("value");
		System.out.println(conformPasswordValue);

		
		

		
		
		
		
	}

}
