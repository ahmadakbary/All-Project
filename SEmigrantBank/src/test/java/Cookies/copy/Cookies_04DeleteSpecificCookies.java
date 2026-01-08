package Cookies.copy;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_04DeleteSpecificCookies {
public static void main(String[] args) {
		
	
	
	
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	
			System.out.println(driver.manage().getCookies());
			
			Set <Cookie> cookies = driver.manage().getCookies();
			System.out.println("size of cookies "+cookies.size());
			
			
			Cookie obj = new Cookie("MyCookie123","1234567890");
			driver.manage().addCookie(obj);
			
			cookies = driver.manage().getCookies();// this method add cookies into your browser
			
			driver.manage().deleteCookie(obj);
			cookies = driver.manage().getCookies();
			
			
			System.out.println("size of cookies: "+cookies.size());
			for (Cookie cookie: cookies) {
				System.out.println(cookie.getName()+ ":"+ cookie.getValue());
			}
			driver.quit();

	}

}
