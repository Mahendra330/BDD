package RestassuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class VerifyContent {

// Verifying Single Content from Response Body
	
	@Test(priority=1)
	
	public void verifyingSingContent() {
		given()
		/* if you want to send some parameter and header with your request, then add it in given sections*/
		.param("Name", "Mahendra")
		.header("Myheader","INDIA")
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/hyderabad")
		.then()
		.statusCode(200);
		//.body("Json path from json path finder",equalTo("Hyderabad"));// Verifying Single Content from Response Body
		//.body("Json path from json path finder",hasItems("Hyderabad"));// Verifying multiple Content from Response Body
		
	}
	
	
}
