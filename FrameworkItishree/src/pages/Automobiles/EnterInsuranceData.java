package pages.Automobiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import libraries.CommonLibrary;

public class EnterInsuranceData {
	
	WebDriver dr;
	CommonLibrary lib= new CommonLibrary();
	
	public EnterInsuranceData(WebDriver dr)

	{
		this.dr=dr;
				
	}
	
	By make = By.id("make");
	By engineperformance =By.id("engineperformance");
	public boolean isMakeDropdownDisplayedDisplayed()
	{
		return lib.isElementPresent(dr, make);
	}
	public boolean isEnginePerformanceTextBoxisplayed()
	{
		return lib.isElementPresent(dr, engineperformance);
	}

	public void selectMaker(String visibleText)
	{
		Assert.assertEquals(true,lib.isElementPresent(dr, make));
		/*
		 * Select sel= new Select(dr.findElement(make)); sel.selectByValue(visibleText);
		 */
	
		lib.selectByVisibleText(dr,make, visibleText);
		
	}
	
	public void enterEnginePerformance(String enginePerformanceinKW)
	{
		dr.findElement(engineperformance).sendKeys(enginePerformanceinKW);
	}
	
}
