package Intro;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegistration {

	public static String getRandomEmail() {
		return "automation" + System.currentTimeMillis() + "@" + "opencart.com";
		// return "automation" + UUID.randomUUID()+"@opencart.com";

		// automation14256@opencart.com
		// automation14256@opencart.com
		// automation14256@opencart.com
		// automation14256@opencart.com
		
		//Delete from user where email like "%automation%";
		//End of the day it will delete all emails -- clean up strategy

	}

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(brUtil.getPageTitle());

		System.out.println(brUtil.getPageURL());

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By phoneNumber = By.id("input-telephone");
		By pssword = By.id("input-password");
		By conformPassword = By.id("input-confirm");

		By subscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By subscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");

		By policycheck = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

		By successMesg = By.tagName("h1");

		EllementUtil eleUtil = new EllementUtil(driver);
		eleUtil.doSendkeys(firstName, "victor");
		eleUtil.doSendkeys(lastName, "automation");
		eleUtil.doSendkeys(emailId, StringUtils.getRandomEmail());
		eleUtil.doSendkeys(phoneNumber, "7686546754");
		eleUtil.doSendkeys(pssword, "victor@345");
		eleUtil.doSendkeys(conformPassword, "victor@345");

		eleUtil.doClick(subscribeYes);

		eleUtil.doClick(policycheck);

		eleUtil.doClick(continueBtn);

		String actSuccMesg = eleUtil.doGetElementText(successMesg);
		System.out.println(actSuccMesg);
//		if (actSuccMesg.equals("Your Account Has Been Created")) {
//			System.out.println("user Reg -- PASSED");
//		} else {
//			System.out.println("user Reg -- FAILED");
//		}

		// https://naveenautomationlabs.com/opencart/index.php?route=account/success

		String url = brUtil.getPageURL();
		if (url.contains("account/success")) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

	}

}
