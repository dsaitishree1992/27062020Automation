package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass3 {
	
	
	@BeforeTest
	public void beforeModule2()
	{
		System.out.println("Before Module 2");
	}
	@AfterTest
	public void afterModule2()
	{
		System.out.println("After Module 2");
	}
	@Test
	public void test1()
	{
		System.out.println("Calss 3-Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Class 3 - Test 2");
	}

}
