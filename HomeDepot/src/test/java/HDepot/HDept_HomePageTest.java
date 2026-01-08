package HDepot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HDept_HomePageTest extends HDept_MainClass{

	HDept_HomePage homepage ;
	HDept_LoginPage loginpage;
	
	public HDept_HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		driver =intializeBrowser();
		loginpage = new HDept_LoginPage();
		
	}
	
	
	@Test
	public void myAccount() {
		homepage.clickMyAccount();
		homepage.RegisterButtonClick();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
}
