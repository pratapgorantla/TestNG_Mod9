package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTest {

//CREATE AN OBJECT FOR softAssert Class
	
	SoftAssert softAssert = new SoftAssert();
	
	
	@Test
	public void doRegistrationTest(){
		String expectedTitle ="Nike";
		String actualTitle = "Abcd";
		
		System.out.println("A");
		//Assert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals("a", "c");
		System.out.println("B");
		
//For generating the report of failed assert
		softAssert.assertAll();
		//Assert.assertTrue(2>1, "Error Message");
		//Assert.assertTrue(isElementPresent ("XXX"), "Element not found");
	}
	
	

}
