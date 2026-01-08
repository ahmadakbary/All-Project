package piit.RRegression;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class W4Annotation {
	
  @Test
  public void f() {
	  System.out.println("this is the test annotation");
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
public void nd() {
	System.out.println("this is second annotatoin");
}

@Test 
public void third() {
	System.out.println("thi is third annotation");
}
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is Before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is After class annotation");

  }



}
