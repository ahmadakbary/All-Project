package Basics;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
public static void main(String[] args) {	
	}	
public static void clickWithJs(WebDriver driver)	{
		JavascriptExecutor js=(JavascriptExecutor)driver;		
	}
//This methods accept two paramete, a webElement & String value to pass
public static void sendValueWithJS(WebElement element, String value,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById,('"+element+" ').value='"+value+"'");		
	}
//this method accept two parameters a webElement & a string value as date from calender
public static void selectDateByHJS(WebElement element, String date,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);				
	}
//this method will scroll dwon to bottom of the page.
public static void scrollPageDownwithJs(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,docment.boyd.scrollHeight)");
		

		
	}
}
