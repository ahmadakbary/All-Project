package Cookies.copy;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;
public class Cookies_03HowToAddNewCookiesToTheBrowser {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Cookie obj = new Cookie ("Mycookie123:", "1234567890");
		driver.manage().addCookie(obj);
	
		cookies = driver.manage().getCookies();// this method add cookies into your browser
		
		System.out.println("size of cookies"+cookies);
		
		for (Cookie cookie: cookies) {
			System.out.println(cookie.getName() +" "+cookie.getValue());
		}
		
		//driver.quit();
		
	}

}
