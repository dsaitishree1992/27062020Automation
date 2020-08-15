package testNGAttributes;

import org.testng.annotations.Test;

public class TestNGAttributes {
	
	@Test(priority=0)
	public void login()
	{
		System.out.println("Login");
	}

	@Test(priority=1)
	public void logout()
	{
		System.out.println("Logout");
	}
	
}
