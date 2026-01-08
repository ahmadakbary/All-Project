package piit.RRegression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitTestingW1 {

public static WebDriver blackhorse;
public static WebDriver Loin;
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Drivers\\chromedriver.exe");	
		blackhorse=new ChromeDriver();
	 	 
	 blackhorse.get("https://www.google.com");
	 		Thread.sleep(2000);
	 blackhorse.get("https://www.facebook.com");
	 		Thread.sleep(2000);
	 blackhorse.get("https://www.walmart.com");
	 		Thread.sleep(2000);
	 blackhorse.get("https://www.homedepot.com");
	 
	 blackhorse.manage().window().maximize();
	 //blackhorse.close();
	 
	 //blackhorse.quit();
	 
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\asbeh\\eclipse-workspace\\RRegression\\Drivers\\geckodriver.exe");
	 	Loin=new FirefoxDriver();
		
	 	Loin.navigate().to("https://www.google.com");
	 	Loin.get("https://www.amazon.com");
     
	 	Loin.get("https://www.walmart.com");
	 	Loin.get("https://www.bestbuy.com");
   Thread.sleep(2000);
   		Loin.navigate().refresh();
   		Loin.manage().window().maximize();
   Thread.sleep(2000);
   		Loin.navigate().back();
   		Loin.navigate().forward();
   		Loin.quit();
	 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
