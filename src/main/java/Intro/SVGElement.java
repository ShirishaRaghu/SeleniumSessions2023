package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!678876521201!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwncWvBhD_ARIsAEb2HW-zL_7oaPuP4wyfrVzCfHJl-zlJkAeFJdm1oR24TmanH9zq5UXHEIAaAiSmEALw_wcB");
      //driver.get("https://petdiseasealerts.org/forecast-map#/");
      Thread.sleep(2000);
      
      
      //SVG -- Scaler Vector Graphs -- normal xpath will not work
      // //*[local-name()='svg']
		
      driver.findElement(By.name("q")).sendKeys("macbook");
	  driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();
      
      
	}

}
