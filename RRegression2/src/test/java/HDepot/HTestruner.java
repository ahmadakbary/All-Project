package HDepot;

import org.testng.annotations.Test;

import HDepotShared.Shared;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class HTestruner extends Shared{
																//HomeDepot Project
	@Test
  public void f()  {
	  
	  HomePage HomeDepot=new HomePage(driver);
	  HomeDepot.MyAccount();
	  HomeDepot.RegisterButtonClick();	    
	  HomeDepot.selectonbutton();
	  HomeDepot.email();
	  HomeDepot.passwordfield();
	  HomeDepot.ZipcodeField();
	  HomeDepot.phonefiled();
	  HomeDepot.checkbox();
	  HomeDepot.SelectOnCreate();
	  
	  
	
	  
  }
  
	 }
