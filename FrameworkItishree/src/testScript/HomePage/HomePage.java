package testScript.HomePage;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Driver.driver;
import libraries.CommonLibrary;
import pages.Automobiles.EnterInsuranceData;

public class HomePage extends driver {
	
	WebDriver dr;
	CommonLibrary lib;
	pages.HomePage homePage;
	
	@BeforeClass
	public void launchBrowser()
	{
		dr=lib.launchBrowser("Chrome");
		homePage= new pages.HomePage(dr);
	}
	@AfterClass
	public void quitBrowser()
	{
		dr.quit();
	}
	
	@Test
	public void isAutomobileVisible()
	{
		Assert.assertEquals(homePage.isAutomobileDisplayed(), true);
	}
	@Test
	public void isTruckVisible()
	{
		Assert.assertEquals(homePage.isTruckDisplayed(), true);
	}
	@Test
	public void isMotorcycleVisible()
	{
		Assert.assertEquals(homePage.isMotorcycleDisplayed(), true);
	}
	@Test
	public void isCamperVisible()
	{
		Assert.assertEquals(homePage.isCamperDisplayed(), true);
	}
	@Test
	public void isAutomobileClickable()
	{
		homePage.clickAutomobile();
		Assert.assertEquals(EnterInsuranceData.isMakeDropdownDisplayedDisplayed(), true);
	}
	
	@Test
	public void verifyIsTruckClickable()
	{
		
	}
	
	

}
