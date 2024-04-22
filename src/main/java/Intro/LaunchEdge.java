package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page title: " + title);

		// checkpoint/verification point/act vs exp:
		if (title.equals("Google")) {
			System.out.println("correct title -- PASS");
		} else {
			System.out.println("incorrect title -- FAIL");
		}

		// automation steps + verification point ---> Automation Testing
		// test steps + verification point -- test case

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("google.com")) {
			System.out.println("url -- PASSED");
		} else {
			System.out.println("url -- FAILED");
		}
		
		//close the broser:quit() and close()
		driver.close();

		
	}

}
