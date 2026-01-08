package piit.RRegression;

import org.testng.annotations.Test;

import Shared.W7Comons;
import pages.W6Home;
import pages.W6forgot;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class W6Continue extends W7Comons {
  
	@Test(priority =3)
  public void f() {  
	  W6Home ob=new W6Home(driver);
	  ob.email("asbehrooz@yahoo.com");
	  ob.pass("Don'tLook");
	  ob.loginbutton();
	  ob.fogotlink(); 
	  
	 
	    }
  //@Test (priority = 2)
  public void forgotid() {
	 W6Home ob=new W6Home(driver);
	 ob.fogotlink();
	 W6forgot fr=new W6forgot (driver);
	 fr.button2();	 
  }
  //@Test(priority = 1)
  public void squnce() {
 System.out.println("this is annotations");
	  
  }

}
