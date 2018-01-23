//PARAMETERIZING THE TESTCASE//

package testcases;
import org.testng.annotations.*;

public class LoginTest {
	
	@Test(dataProvider = "getData")
	public void doLoginTest(
			String username,
			String password,
			String expRes,
			String browser
			){
	
	}
	
	@DataProvider
	public Object[][] getData(){
		
//Creating an object Array, No of ROWS represent no. of iterations, No of columns represent no. of data parameters
		
		Object [][] data = new Object[3][4];
		
		// first row 
		data[0][0] = "Username1";
		data[0][1] = "Password1";
		data[0][2] = "Pass";
		data[0][3] = "Mozilla";
		
		data[1][0] = "Username2";
		data[1][1] = "Password2";
		data[1][2] = "Pass";
		data[1][3] = "Chrome";
		
		data[2][0] = "Username3";
		data[2][1] = "Password3";
		data[2][2] = "Pass";
		data[2][3] = "IE";
		return data;
	}

	

}
