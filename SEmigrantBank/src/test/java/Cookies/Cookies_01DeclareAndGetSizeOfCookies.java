package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_01DeclareAndGetSizeOfCookies {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		Set <Cookie> cookies = driver.manage().getCookies(); //capture all the cookies from the browser
		
	System.out.print("size of cookies: " +cookies.size()); //print size of cookies
	
	
		for (Cookie cookie: cookies) { //read and pring all the cookies
			System.out.println(cookie.getName()+ ":" +cookie.getValue());
		}
	}

}
