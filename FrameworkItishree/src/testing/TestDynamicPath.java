package testing;

public class TestDynamicPath {

	public static void main(String[] args) {
		
		//System.out.println(System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		test1("Sudha");
	}
	public static void test1(String name)
	{
		switch(name)
		{
		case "Sudha":
		
			System.out.println("Sudha is learning Automation");
			break;
		case "Prachee":
			System.out.println("Prachee is learning Automation");
			break;
			
			
		}
	}

}
