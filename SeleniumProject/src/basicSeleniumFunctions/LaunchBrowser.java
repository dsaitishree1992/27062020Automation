package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//set ChromeDriver path
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		//maximize the browser
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/#");
		
		//dr.findElement(By.id("nav_automobile")).click();
		
		WebElement ele = dr.findElement(By.id("nav_automobile"));
		
		String data = ele.getText();
	    System.out.println(data);
	    //ele.click();
	    
	    //enter text
	    
	    dr.findElement(By.id("search_form")).sendKeys("VW");
	    dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
	    
	
	}

}
