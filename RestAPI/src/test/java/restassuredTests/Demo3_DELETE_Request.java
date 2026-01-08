package restassuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import io.restassured.response.Response;


public class Demo3_DELETE_Request {
	
	public void testDELETE() {
		
		Response response=
		given()
		
		.when()
			.delete("http://dummy.restapi/example.com/api/v1/update/99389")
		
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.extract().response()
			
	}
	

}
