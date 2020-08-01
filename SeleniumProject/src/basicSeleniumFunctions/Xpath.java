package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		//maximize the browser
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/#");
		
			
		WebElement ele = dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		String data = ele.getText();
	    System.out.println(data);
		ele.click();
		dr.findElement(By.xpath("//a[@id='make']")).click();

	}

}
