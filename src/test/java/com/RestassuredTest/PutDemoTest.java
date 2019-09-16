package com.RestassuredTest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import io.restassured.RestAssured;

public class PutDemoTest {

	public static HashMap map= new HashMap();
			
	@BeforeClass
	
	public void putBeforeTest() {
		map.put("employee", RestUtil.getEmployeeName());
		map.put("employeeAge", RestUtil.getEmployeeAge());
		map.put("Salary", RestUtil.getSalary());
		int emply_ID = 170798;
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/update/"+emply_ID;
		
	}
	
	@Test
	
	public void putTest() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
