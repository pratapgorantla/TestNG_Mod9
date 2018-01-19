package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before executing all test cases");
	}
	
	
	@AfterTest
	public void afterTest(){
		System.out.println("After executing all the test cases");
	}
		
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("--Before Method");
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("--After Method--");
	}
	
	
	@Test(priority=1)
	public void loginTest(){
//WebDriver code
		System.out.println("Login Test Execution");
	}
	
	
	@Test(priority=2)
	public void passwordChangeTest(){
//FOR SKIPPING ANY TEST CASE, ADD BELOW LINE
		throw new SkipException("Skip testcase, coverage not needed");
//System.out.println("Changing password");
	}

//If a test case is dependent of another test case then add dependsOnMethods={"methodName"}
	@Test(priority=3, dependsOnMethods={"passwordChangeTest"})
	public void logoutTest(){
		System.out.println("Logging out");
	}
	
	
}
