package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Demo_Get_Request {
	
	
	@Test
	public void GetWeatherDetail() {
		
		
		given ()
			.when()
				.get("http://restapi.demoqa.com/utilities/weather/city/Delhi")
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
	}

}
