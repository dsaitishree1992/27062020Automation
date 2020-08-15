package testNGAttributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGParameters {
	
	@Test
	@Parameters("browser")

	public void lounchbrowser(String browserName)
	{

		System.out.println("Lounch  "+browserName);
	

	}

}
