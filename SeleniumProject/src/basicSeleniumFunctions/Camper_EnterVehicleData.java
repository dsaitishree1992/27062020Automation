package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Camper_EnterVehicleData {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/#");
		dr.findElement(By.id("nav_camper")).click();
		WebElement makedropdown = dr.findElement(By.name("Make"));
		Select sel= new Select(makedropdown);
		sel.selectByIndex(6);
		dr.findElement(By.id("engineperformance")).sendKeys("500");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("07/07/2000");
		WebElement noofSeatsDropDown=dr.findElement(By.name("Number of Seats"));
		Select seat= new Select(noofSeatsDropDown);
		seat.selectByValue("1");
		dr.findElement(By.className("ideal-radio")).click();
		WebElement fuelTypeDropDown=dr.findElement(By.name("Fuel Type"));
		Select fuel= new Select(fuelTypeDropDown);
		fuel.selectByIndex(1);
		dr.findElement(By.id("payload")).sendKeys("500");
		dr.findElement(By.id("totalweight")).sendKeys("500");
		dr.findElement(By.id("listprice")).sendKeys("500");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("500");
		dr.findElement(By.id("annualmileage")).sendKeys("500");
		dr.findElement(By.id("nextenterinsurantdata")).click();
		dr.findElement(By.id("firstname")).sendKeys("Itishree");
		dr.findElement(By.id("lastname")).sendKeys("Das");
		dr.findElement(By.id("birthdate")).sendKeys("01/01/1992");
		dr.findElement(By.xpath("//*[text()='Female']")).click();
		dr.findElement(By.id("streetaddress")).sendKeys("Street Number 33");
		WebElement countryDropDown=dr.findElement(By.name("Country"));
		Select cou= new Select(countryDropDown);
		cou.selectByVisibleText("India");
		dr.findElement(By.id("zipcode")).sendKeys("411014");
		dr.findElement(By.id("city")).sendKeys("Pune");
		
		WebElement occupationDropDown=dr.findElement(By.name("Occupation"));
		Select occ= new Select(occupationDropDown);
		occ.selectByIndex(1);
		dr.findElement(By.className("ideal-check")).click();
		dr.findElement(By.id("website")).sendKeys("Http://abc.com");	
		dr.findElement(By.id("nextenterproductdata")).click();
        dr.findElement(By.id("startdate")).sendKeys("09/26/2020");
		
		WebElement insuranceDropDown=dr.findElement(By.name("Insurance Sum"));
		Select ins= new Select(insuranceDropDown);
		ins.selectByIndex(3);
		WebElement damageDropDown=dr.findElement(By.name("Damage Insurance"));
		Select dam= new Select(damageDropDown);
		dam.selectByIndex(3);
		dr.findElement(By.xpath("//input[@id='EuroProtection']//following::span[1]")).click();
		dr.findElement(By.id("nextselectpriceoption")).click();
		dr.findElement(By.xpath("//input[@id='selectsilver']//following::span[1]")).click(); // Select Silver
    	Thread.sleep(3000);
    	dr.findElement(By.id("nextsendquote")).click();
		
		
	}

}
