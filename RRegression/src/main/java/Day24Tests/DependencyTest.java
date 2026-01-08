package Day24Tests;
import org.junit.Assert;
import org.testng.annotations.Test;
public class DependencyTest {	
@Test (priority=1)
void OpenURL() //fail
	{
	Assert.assertTrue(true);
	}
	// if your OpenURL but making sure it's passed or failed you have parrameterized
	// by the next test priority as line 15	
@Test (priority=2,dependsOnMethods={"OpenURL"})
	void login() 
	{
		Assert.assertTrue(false);
	}
@Test (priority=3,dependsOnMethods={"login"})
	 void search ( ) 
	 {
		 Assert.assertTrue(false);
	 }
	// if you parameterize multiple methods each should be in quotations "", ""
@Test (priority=4, dependsOnMethods={"login","search"})
	 void Advserach()
	 {
		 Assert.assertTrue(true);			 
	 }
@Test (priority=5, dependsOnMethods= {"login"})
	void logout() 
	{
		Assert.assertTrue(true);
}
}