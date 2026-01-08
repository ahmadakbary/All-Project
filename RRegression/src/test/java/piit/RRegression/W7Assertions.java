package piit.RRegression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Shared.W7Comons;
import pages.W6Home;

public class W7Assertions extends W7Comons {
  @Test
  public void f() {
	  W6Home Home=new W6Home(driver);
	  Home.email("loin@yahoo.com");
	  Home.pass("tiger");
	  Home.loginbutton();
//Thread.sleep(6000);
	  
	  SoftAssert SoftAssert=new SoftAssert();
	  String Currenturlpages=driver.getCurrentUrl();
	  System.out.println(Currenturlpages);
	  String expectedurlpages="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110";
	  
	  SoftAssert.assertEquals(Currenturlpages, expectedurlpages);
	 String heading=driver.findElement(By.xpath("//div[text()='Log Into Facebook']")).getText();
	 String headingofexpected="Log Into Facebook";
	System.out.println(heading);
	System.out.println("thi is before assertion");
	SoftAssert.assertEquals(heading,headingofexpected);
	System.out.println("this is after assertion");
	 boolean forgot=driver.findElement(By.linkText("Forgot Password?")).isDisplayed();
	 SoftAssert.assertEquals(forgot, true);
	 SoftAssert.assertAll();
	 
  }
}
