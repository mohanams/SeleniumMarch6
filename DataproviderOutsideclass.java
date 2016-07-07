package day8;

import org.testng.annotations.DataProvider;

public class DataproviderOutsideclass {
	
	@DataProvider(name = "DP_outsideclass")
	public static Object[][] DP_Test()
	{
		Object[][] obj = new Object[2][1];
		
		obj[0][0]="swati";
		obj[1][0]="Anjali";
		
		return obj;
	}

}
