package testNGAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="getData")
	public void login(String username, String password)
	{
		System.out.println("Enter Username="+username);
		System.out.println("Enter Password="+password);
		System.out.println("click on Login button");
		System.out.println("************");
	}
	

	@DataProvider
	public String[][] getData()
	{
		String[][] data =new String[3][2];
		//DATA
		
		data[0][0]="User1";
		data[0][1]="Password1";
		
		
		data[1][0]="User2";
		data[1][1]="Password2";
		
		
		data[2][0]="User3";
		data[2][1]="Password3";
		
		
		return data;
				
	}
}
