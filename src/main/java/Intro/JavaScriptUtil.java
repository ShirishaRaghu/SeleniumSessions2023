package Intro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	private WebDriver driver;
	private JavascriptExecutor js;

	public JavaScriptUtil(WebDriver driver, JavascriptExecutor js) {
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		
	}
	
	
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//red
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element);// green
			changeColor(bgcolor, element);// red
		}
	}
	
	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
	
	public String getTitleByJS() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.title;").toString();
		}
	
	public String getURL() {
		return js.executeScript("return document.URL;").toString();
	}
	
	
	public void goBackJS() {
		js.executeScript("history.go(-1)");
	}
	
	public void goForwardJS() {
		js.executeScript("history.go(1)");
	}
	
	public void refreshBrowserJS() {
		js.executeScript("history.go(0);");
	}
	
	public void generateAlert(String message) {
		js.executeScript("alert('"+ message +"')");
	}

	public void generateConfirmPopUp(String message) {
		js.executeScript("confirm('"+ message +"')");
	}

	
	public String getPageInnerText() {
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendKeysUsingWithId(String id, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
						  //document.getElementById('input-email').value ='tom@gmail.com'
	}


	
	
	public void scrollPageDown() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrollPageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	
	public void scrollPageDown(String height) {
		js.executeScript("window.scrollTo(0, '" + height+ "')");
	}
	
	public void scrollPageDownMiddlepage() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
	}
	
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	/**
	 * example: "document.body.style.zoom = '400.0%'"
	 * @param zoomPercentage
	 */
	public void zoomChromeEdgeSafari(String zoomPercentage) {
		String zoom = "document.body.style.zoom ="+zoomPercentage+"%";
		js.executeScript(zoom);
	}
	
	/**
	 * example: "document.body.style.MozTransform = 'scale(0.5)'; ";
	 * @param zoomPercentage
	 */
	public void zoomFirefox(String zoomPercentage) {
		String zoom = "document.body.style.MozTransform = 'scale("+zoomPercentage+")'";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(zoom);
	}
	
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
}
