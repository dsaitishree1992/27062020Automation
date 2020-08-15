package testNGAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttributes2 {
	
	@Test()
	public void login()
	{
		System.out.println("Login");
		Assert.assertEquals(10, 20);
	}

	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		System.out.println("Logout");
	}
	
}
