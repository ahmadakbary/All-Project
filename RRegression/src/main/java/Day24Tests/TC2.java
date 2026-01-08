package Day24Tests;
import org.testng.annotations.AfterTest.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {

@Test (priority=1)
void tm3()
	{
System.out.println("this is tm3 from TC2.....");
	}
@Test (priority=2)
void tm4()
	{
System.out.println("this is tm4 from TC2.....");	
	}
@BeforeTest
void m1()
	{
System.out.println("This is m1.....");
	}
}