package com.RestassuredTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class DeleteDemoTest {
	
		
	@Test
	public void deteleTest() {
		
		//int Employee_ID= 170801;
		RestAssured.baseURI= "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath= "/delete/170832";
		Response response= //Response Data will be extracted and will save to variable response
		given()
		.when()
		.delete()
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()
		.extract().response(); // Response Data will be extracted in the form of JSON
		
		String jsonString= response.asString(); //It will convert JSN Data to String
		
		Assert.assertEquals(jsonString.contains("successfully! deleted Records"), true);// This will check condition
	}

}
