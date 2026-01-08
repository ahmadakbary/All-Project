package Day24Tests;
import org.junit.Assert;
import org.testng.annotations.Test;
public class AssertionsApproach1 {
	
	@Test
	void tm ()
	{
String exp_title = "abcxyz";
String act_title = "abcxyz";

		//Appraoch1
//plz remember to always import assertions from 
//Import'Assert'(org.testng)
Assert.assertEquals(exp_title, act_title);

	
}
}