package RestassuredTest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class UpdateDemo {
	public static HashMap map= new HashMap();
	
	@BeforeClass
	
	public void beforeClassUpdate() {
		
		map.put("FirstName", RestUtil.getFirstName());
		map.put("LastName", RestUtil.getLastName());
		map.put("Password", RestUtil.getPassword());
		map.put("Email", RestUtil.getEmail());
	// Also mention prerequite URL
		
		RestAssured.baseURI= "http://restapi.demoqa.com/customer";
		RestAssured.basePath= "/register";//Here you can mention path parameter(fix value) or query parameter
	}
	
	@Test
	
	public void testPostData() {
		
			given()
			.contentType("application/json")
			.body(map)
			.when()
			.post()
			.then()
			.statusCode(400);
			//.and()
			//.body("FaultId", equalTo("Invalid post data, please correct the request"))
			//.body("fault", equalTo("FAULT_INVALID_POST_REQUEST"));
			
		
		
		
		
	}

	private ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
