package piit.RRegression;

import org.testng.annotations.Test;

import Shared.W7Comons;
import pages.W6Home;

import org.testng.annotations.DataProvider;

public class W7errors extends W7Comons {
	
  @Test(dataProvider = "dp")
  
  public void f(String email, String pass) throws InterruptedException {
	W6Home ob=new W6Home	(driver);
	 ob.email(email);
	 Thread.sleep(6000);
	 ob.pass(pass);
	 ob.loginbutton();
 
 Thread.sleep(8000);
 driver.navigate();  
  }	  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asbehrooz@yahoo.com", "really" },
      new Object[] { "akbary@yahoo.com", "Don'tLook" },
      new Object[] { "ashburn@yahoo.com", "" },
    };
  }
}
