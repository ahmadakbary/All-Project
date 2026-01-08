package Day23TestNG;
import org.testng.annotations.Test;
/*
 * TestNG
 * 1)	Launch browser
 * 2) 	open url
 * 3)	login
 * 4)	close browser
 */
public class FirstTestCase {
	// if we don't proirotize the methods the methods will run 
	// by alphabatic from a to z if set priority then it run 
	// into the orders.
	
@Test (priority=1)
void launchBrowser()
	{
		// Selenium code
		System.out.println("Launch browser...............");	
	}
@Test(priority=2)
void openUrl()
	{
		// Selenium code
		System.out.println("Opening URL........");
	}
@Test (priority=3)
void login()
	{
		// Selenium code
		System.out.println("login to application");
	}
@Test (priority=4)
void closeBrowser()
	{
		// Selenium code
		System.out.println("Closing browser");
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	