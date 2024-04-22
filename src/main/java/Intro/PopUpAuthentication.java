package Intro;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAuthentication {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		// basic auth:
		String username = "admin";
		String password = "admin";

		// driver.get("https://admin:admin@");

		// sel 4.x:
		// HasAuthentication

		((HasAuthentication) driver).register(() -> new UsernameAndPassword(username, password));

		driver.get("");

	}

}
