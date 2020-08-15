package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import configuration.Configuration;

public class CommonLibrary {
	
	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		switch(browserName)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",Configuration.chromePath);
			dr= new ChromeDriver();
			break;
		case "Firefox":
			//add driver for Firefox driver
			dr= new FirefoxDriver();
			break;
			
			//add more cases for other browser
			
		}
		dr.manage().window().maximize();
		navigatetoHomePage(dr);
		dr.manage().timeouts().implicitlyWait(Configuration.implicitwait, TimeUnit.SECONDS);
		return dr;
	}
	
	public void navigatetoHomePage(WebDriver dr)
	{
		dr.get(Configuration.url);
	}
	public boolean isElementPresent(WebDriver dr, By element)
	{
		int size=dr.findElements(element).size();
		if(size>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void selectByVisibleText(WebDriver dr, By element, String visibleText)
	{
		Select sel= new Select(dr.findElement(element));
		sel.selectByVisibleText(visibleText);
	}
}
