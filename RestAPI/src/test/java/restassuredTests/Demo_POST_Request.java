package restassuredTests;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import java.util.HashMap;

public class Demo_POST_Request {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postdata() {
		
		map.put("FirstName", "ABCXYZ123");
		map.put("LastName", "ABCXYZ123");
		map.put("UserName", "ABCXYZ123");
		map.put("Password", "ABCXYZ123");
		map.put("Email", "ABCXYZ123@gmail.com");		
}
	@Test
	public void testPost()	{
		
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post("http://restapi.demoqa.com/utilities/weather/city/Delhi")
		.then()
			.statusCode(201)
			.assertThat().body("Message", equalTo("Operation completed successfully"));
			.log().all();
		
	}

}
