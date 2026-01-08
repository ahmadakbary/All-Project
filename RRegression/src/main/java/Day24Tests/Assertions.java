package Day24Tests;


import org.junit.Assert;
import org.testng.annotations.Test;
public class Assertions {
	
	@Test
	void tm ()
	{
String exp_title = "abcxyz";
String act_title = "abcxyz";
	// I am using conditional statement purposely but my 
	// test case is failed because the test is passed my 
	// conditional statement failed, reason TestNG does not 
	// consider the conditional statement.
/*if (exp_title.equals(act_title))
	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test is failed");*/


	//Appraoch1
	//plz remember to always import from 
	//Import'Assert'(org.testng)
	Assert.assertEquals(exp_title, act_title);

//Approach2
	if (exp_title.equals(act_title))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertFalse(false);




	}
	}
}










