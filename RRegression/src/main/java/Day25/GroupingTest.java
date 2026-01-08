package Day25;
import org.testng.annotations.Test;
/* loginByemail - sanity
 * loginByfacebook - sanity
 * loginBytwitther - sanity
 * 
 * signupByemail - sanity, regression
 * signupByfacebook - sanity, regression
 * signupBytwitther - sanity, regression
 * 
 * paymentReturnbybank - regression
 * paymentindollar - regression
 * paymentinrupees - regression
 */
public class GroupingTest {

@Test(priority=1, groups= {"sanity"})
public void loginByemail()
	{
		System.out.println("This is login by email");
	}
	
@Test(priority=2, groups= {"sanity"})
public void loginByfacebook()
	{
	System.out.println("This is login by email");
	}
	
@Test(priority=3, groups= {"sanity"})
public void loginBytwitter()
	{
	System.out.println("This is login by twitter");
	}
	
@Test(priority=4, groups= {"sanity","regression"})
public void signupbyemail()
	{
	System.out.println("signup by email");
	}
	
@Test(priority=5, groups= {"sanity","regression"})
public void signupbyfacebook()
	{
	System.out.println("signup by facebook");	
	}

@Test(priority=6, groups= {"sanity","regression"})
public void signupbytwitter()
	{
		System.out.println("sign by twitter");
}	
@Test(priority=7, groups= {"regression"})
public void paymentReturnbybank()
	{
	System.out.println("This is login by email");
	}

@Test(priority=8, groups= {"regression"})
public void paymentindollar()
	{
	System.out.println("This is login by email");	
	}

@Test(priority=9, groups= {"regression"})
public void paymentinrupees()
		{
		System.out.println("This is login by email");

		}
}









