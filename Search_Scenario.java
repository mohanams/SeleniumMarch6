package TestScript;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic.Base_Class;

public class Search_Scenario extends Base_Class {
	
	
	@Test(dataProvider="DP_validsearch",dataProviderClass=DataProviders.Search_DP.class)
	public void valid_search(String searchkey,String expected)
	{
		//String expected="494";
		driver.findElement(By.id("srchword")).sendKeys(searchkey);
		driver.findElement(By.className("newsrchbtn")).click();
		String Actual = driver.findElement(By.id("find")).getText();
		if (Actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test case has passed");
		}
		else
		{
			System.out.println("Test case has failed");
		}
	}
	@Test(dataProvider="DP_invalidsearch",dataProviderClass=DataProviders.Search_DP.class)
	public void invalid_search(String searchkey,String expected)
	{
		//String expected="Sorry..'ahjytr' does not match any product on Rediff Books.";
		driver.findElement(By.id("srchword")).sendKeys(searchkey);
		driver.findElement(By.className("newsrchbtn")).click();
		String Actual = driver.findElement(By.className("sorrymsg")).getText();
		if (Actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test case has passed");
		}
		else
		{
			System.out.println("Test case has failed");
		}
	}

}
