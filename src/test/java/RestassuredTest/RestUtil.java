package RestassuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {

	
	public static String getFirstName() {
		String generatedString= RandomStringUtils.randomAlphabetic(1);
				return("John"+generatedString);
	}

public static String getLastName() {
		String generatedString= RandomStringUtils.randomAlphabetic(2);
		return("Barik" +generatedString);
}
public static String getPassword() {
	String generatedString= RandomStringUtils.randomAlphabetic(2);
	return("abcdef" +generatedString);
}

public static String getEmail() {
	String generatedString= RandomStringUtils.randomAlphabetic(2);
	return("abcdef" +generatedString +"gmail.com");
}

public static String getEmployeeName() {
	String generatedString= RandomStringUtils.randomAlphabetic(1);
	return("abcdef" +generatedString);
}

public static String getSalary() {
	String generatedString= RandomStringUtils.randomAlphabetic(5);
	return(generatedString);
}
public static String getEmployeeAge() {
	String generatedString= RandomStringUtils.randomAlphabetic(3);
	return(generatedString);
}

}
