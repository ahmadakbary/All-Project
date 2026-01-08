package Day24Tests;
import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionApproach2 {
	
	@Test
	void tm ()
	{
String exp_title = "abcxyz";
String act_title = "abcxyz123";
	
//Approach2
// we can use the conditional statement in TestNG
// instead of sysout we can use Assert.assertTrue as 
// below example
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