package TestNG_HRM;

import org.testng.annotations.Test;

public class FristTestCase {

	@Test (priority=1)
	void launchBrowser(){
	System.out.println("Launch browser...............");	
			}
	@Test (priority=2)
	void openUrl(){
	System.out.println("Opening URL........");
			}
	@Test (priority=3)
	void login(){
	System.out.println("login to application");
			}
	@Test (priority=4)
	void closeBrowser(){
	System.out.println("Closing browser");
			}

		}