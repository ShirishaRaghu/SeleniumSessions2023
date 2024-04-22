package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");


	 //type = file is madatory
     
     driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Lenovo\\Documents\\Streams.txt");
		
		
     //sikuli - image based/resolution based
     //autoIT -- only for windows machine -- wont work in docker, headless, jenkins, linux, macos
		
	}

}
