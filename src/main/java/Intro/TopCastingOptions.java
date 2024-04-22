package Intro;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	
	public static void main(String args[]) {
		
		
		//1.WD d = new CD();
		//valid -- recomended
		//WebDriver driver = new ChromDriver();
	
	   //2. SC driver = new CD()
		//valid not recomended -- cannot acess other than FE(),FES()
		//SearchContext driver = new ChromeDriver();
		
		//3.RWD driver = new CD()
		//valid -- recommended
		//But not used more -- what if tomorrow one more class is coming it is directly child of webdriver(Interface)
		//Then i can't access Webdriver methods then i should make top casting again 
		//RemoteWebDriver driver = new ChromeDriver();
		
	    //4. valid -- not recommended
		//ChromiumDriver driver = new ChromeDriver();
	
	    //5. WD driver = new RWD();
		//valid -- recommended
		//run tests on the remote/server/cloud machine/grid/sauce labs/browser stack/lambda test
		//WebDriver driver = new RemoteWebDriver(serverURL, capabilities);
	
		
		//6.valid --  not recommended
		//It has only FE, FES();
		//SearchContext driver = new RemoteWebDriver(serverURL, capabilities);
		
		
		
		//7. CD driver = new ChromeDriver();
		//valid but works only for chrome browser
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	}
	
	
}
