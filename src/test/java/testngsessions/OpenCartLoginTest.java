package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {


	
	@Test(priority = 1)
	public void titleTest() {
		 String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "title is not matched");
	}
	
	@Test
	public void imageTest() {
		boolean flag = driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
	    Assert.assertTrue(flag);
	}

	
	@Test
	public void urlTest() {
    String url =  driver.getCurrentUrl();
    System.out.println(url);
    Assert.assertTrue(url.contains("account/login"));
     }
	
	
	
	
		
	
	
}
