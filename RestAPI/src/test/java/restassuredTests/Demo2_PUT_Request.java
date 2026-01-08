package restassuredTests;
import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Demo2_PUT_Request {

	HashMap map=new HashMap();
	
@BeforeClass
public void update() {
		map.put("name", "Killy");
		map.put("salary", "7000");
		map.put("age", "50");
	}
	@Test
	public void testPut() {
		
		given()
			.contentType("application/json")
			.body(map)
		
		.when()
			.put("http://dummy.restapiexample.com/api/v1/update/99304")
			
		.then()
			.statusCode(200)
			.log().all();
	}
}
