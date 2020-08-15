package Driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import libraries.CommonLibrary;
import libraries.Xls_Reader;

public class driver {
	
	public CommonLibrary lib;
	public Xls_Reader xl;
	
	@BeforeSuite
	public void initialize()
	{
		lib= new CommonLibrary();
		xl= new Xls_Reader("Configuration.testDataPath");
		//other project level initialization
	}
    @AfterSuite
	public void tearDown()
	{
		//Project level Closers
    	
	}
}
