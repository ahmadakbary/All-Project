package Day24Tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterTest.*;
import org.testng.annotations.Test;

public class TC1 {
	
	@Test (priority=1)
	void tm1()
	{
		System.out.println("this is tm1 from TC1.....");
	}
	@Test (priority=2)
	void tm2()
	{
		System.out.println("this is tm2 from TC1.....");
	
	}
	@AfterTest
	void m2 ()
	{
		System.out.println("This is m2.......");
	}
}
