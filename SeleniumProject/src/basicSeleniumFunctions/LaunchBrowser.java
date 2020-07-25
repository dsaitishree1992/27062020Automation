package basicSeleniumFunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//set ChromeDriver path
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com/");
		
	}

}
