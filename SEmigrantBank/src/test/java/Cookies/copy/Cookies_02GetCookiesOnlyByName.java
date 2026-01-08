package Cookies.copy;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_02GetCookiesOnlyByName {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		Set <Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of cookies: " +cookies.size());
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
	}

}
