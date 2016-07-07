package day8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataprovider1 {
	
	@DataProvider(name = "DP")
	public Object[][] DP_Test()
	{
		Object[][] obj = new Object[2][1];
		
		obj[0][0]="fasal";
		obj[1][0]="Rashmi";
		
		return obj;
	}
	
	
	
	
	
	@Test(dataProvider = "DP_outsideclass",dataProviderClass=day8.DataproviderOutsideclass.class)
	public void displayname(String names)
	{
		
		System.out.println(names);
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is to display the after method");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is to display the before method");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Close and save the excel after the test ");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Open excel before test");
	}

}
