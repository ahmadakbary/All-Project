package com.nopcommer.testCases;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.TestBase.BaseClass;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{


		
	@Test
	public void LoginTest() {
		driver.get("http://admin-demo.nopcommerce.com");
		LoginPage lp=new LoginPage ();
		lp.setUserName("admin@yourstore.com");
		lp.setPassword("admin"); 
		lp.ClickLogin();
		
	
		String exp_title="Dashborad / nopCommerce administraction";
		String act_title=driver.getTitle();
		
		if (exp_title.equals(act_title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
			}
}
