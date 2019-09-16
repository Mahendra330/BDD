package com.RestassuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Demo1GetTest {
	
	
	@Test
	public void getWeatherTest() {
		Response response=
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/hyderabad")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			//.assertThat().body(arguments, responseAwareMatcher)
			.header("Content-Type", "application/json")
			//.assertThat().body("City",equalto("Hyderabad"));
			//.body("City",equals("Hyderabad"))
			.log().all()
			.extract().response();
		
		
		String jsontoString= response.asString();
		Assert.assertEquals(jsontoString.contains("Hyderabad"), true);
		
				
	}

	

}
