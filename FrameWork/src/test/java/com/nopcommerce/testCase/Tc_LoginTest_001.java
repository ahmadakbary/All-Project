package com.nopcommerce.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.TestBase.BaseClass;
import com.nopcommerce.pageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass{

	
	@Test
	public void LoginTest() {
		driver.get("http://admin-demo.nopcommerce.com");
		LoginPage lp=new LoginPage (driver);
		
		lp.setUserName("admin@yourstore.com");
		lp.setPassword("admin");
		lp.clickLogin();
		
		
		String exp_title="Dashboard / nopCommerce administration";
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