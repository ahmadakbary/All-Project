package restassuredTests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Demo1_GET_Request {
	
	@Test (priority=1)
	public void GetWeatherDetail()	{	
		given()
			.when()
				.get("http://restapi.demoqa.com/utilities/weather/city/Delhi")
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1. 200 OK")
				.assertThat().body("City",equalTo("Delhi"))
				.header("Content-Type","application/json");
				.log().all();						
}
@Test (priority=2)
public void GetSingleUser()	{
		
		given()
			.when()
				.get("https://reqres.in/api/users/3")
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1. 200 OK")
				.assertThat().body("id",equalTo("3"))
				.header("Content-Type","application/json;charset=utf-8");
				.header("Content-Encoding", "gzip")
				.log().all();
				
}
}
