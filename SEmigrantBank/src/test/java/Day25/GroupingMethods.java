package Day25;

import org.testng.annotations.Test;

public class GroupingMethods {

	@Test (priority=1, groups = {"sanity"})
	public void loginByemail() {
	System.out.println("This is login by email");
		}
	
	@Test (priority=2,groups = {"sanity"})
	public void loginByfacebook() {
	System.out.println("This is login by facebook");		
		}
	
	@Test (priority=3,groups = {"sanity"})
	public void loginBytwitter() {
	System.out.println("This is login by twitter");
		}	
	
	@Test (priority=4,groups= {"sanity","regression"})
	public void signupByemail() {
	System.out.println("signup by email");
		}
	
	@Test (priority=5,groups= {"sanity","regression"})
	public void signupByfacebook() {
	System.out.println("signup by facebook");		
		}
	
	@Test (priority=6,groups= {"sanity","regression"})
	public void signupBytwitter() {
	System.out.println("signup by twitter");
		}
	
	@Test (priority=7, groups={"regression"})
	public void paymentReturnbybank() {
	System.out.println("payment return by bank");
		}
	
	@Test (priority=8, groups={"regression"})
	public void paymentindollar() {
	System.out.println("thi is payment by dlooar method");
		}	
	
	@Test (priority=9, groups={"regression"})
	public void paymentinrupees() {
	System.out.println("This is payment by repees method");
	
	
	
	}
	}
