package DataProviders;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import Generic.ExcelHandlerGeneric;

public class Search_DP {
	
	@DataProvider(name="DP_validsearch")
	public static Object[][] DP_validsearch()
	{
		Object[][] obj=new Object[1][2];
		/*obj[0][0]="ways";
		obj[0][1]="494";*/
		List<String> xlData = getXLData("valid_search");
		for (int i=0;i<xlData.size();i++)
		{
			obj[i][0] = xlData.get(i).split(";")[0];
			obj[i][1] = xlData.get(i).split(";")[1];
			
		}
		return obj;
		
	}
	
	@DataProvider(name="DP_invalidsearch")
	public static Object[][] DP_invalidsearch()
	{
		Object[][] obj=new Object[1][2];
		/*obj[0][0]="ahjytr";
		obj[0][1]="Sorry..'ahjytr' does not match any product on Rediff Books.";*/
		List<String> xlData = getXLData("invalid_search");
		for (int i=0;i<xlData.size();i++)
		{
			obj[i][0] = xlData.get(i).split(";")[0];
			obj[i][1] = xlData.get(i).split(";")[1];
			
		}
		return obj;
		
	}
	
	public static List<String> getXLData(String Scriptname)
	{
		ExcelHandlerGeneric xl=new ExcelHandlerGeneric("D:\\seleniumworkspace\\March2016\\src\\test\\resources\\Data.xlsx");
		String sheetname="Scenario_Search";
		int rowcount = xl.getrowcount(sheetname);
		List<String> list = new ArrayList<String>();
		for (int i=1;i<=rowcount;i++)
		{
			if (xl.getXLCellValue(sheetname, i, 2).equalsIgnoreCase("Y"))
			{
				if (xl.getXLCellValue(sheetname, i, 3).equalsIgnoreCase(Scriptname))
				{
					String searchkey = xl.getXLCellValue(sheetname, i, 4);
					String expected = xl.getXLCellValue(sheetname, i, 5);
					list.add(searchkey+";"+expected);
					
				}
			}
		}
		
		return list;
	}

}
