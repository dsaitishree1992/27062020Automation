package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("//input[@type='email']")).sendKeys("dsaitishree@gmail.com");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("pP123.123");
		dr.findElement(By.xpath("//input[@value='Log In']")).click();
		dr.findElement(By.xpath("//div[@aria-label='Next']")).click();

	}

}
