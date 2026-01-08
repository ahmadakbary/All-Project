package Day24Tests;
import org.testng.annotations.*;
/*1)	Login --- > @BeforeMethod
2)	Search --- > @Test
3)	Logout --- > @AfterMehtod
4)	Login
5)	AdvSearch --- > @Test
6)	Logout
7)	Login
8)	Recharge --- > @Test
9)	Logout*/
public class Annotations {
	@BeforeMethod
	void login() {
	System.out.println("login test");	
	}
	@AfterMethod
	void logout() {
	System.out.println("logout test");
	}
	@Test (priority=1)
	void search(){
		System.out.println("search functionality");
	}
	@Test (priority=2)
	void advancedSearch(){
		System.out.println("Advanced search");
	}
	@Test (priority=3)
	void Recharge(){
		System.out.println("prepaid recharge test");
	}
}
