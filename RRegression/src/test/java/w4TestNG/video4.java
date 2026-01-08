package w4TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class video4 {
  @Test
  
  public void f() {
	  System.out.println("this is before test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }
 
  @Test 
public void td() {
	  System.out.println("this is second test annotation");
  } 
	  	  
@Test
public void third()	 {
	System.out.println("this is third test annotation");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

}
