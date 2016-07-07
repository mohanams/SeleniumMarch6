package DataProviders;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import Generic.ExcelHandlerGeneric;

public class Login_DP {

	@DataProvider(name="valid_login")
	public static Object[][] DP_validlogin()
	{
		Object[][] obj=new Object[1][3];
		List<String> xlData = getXLData("valid_login");
		for (int i=0;i<xlData.size();i++)
		{
			obj[i][0] = xlData.get(i).split(";")[0];
			obj[i][1] = xlData.get(i).split(";")[1];
			obj[i][2] = xlData.get(i).split(";")[2];
		}
		
		/*obj[0][0]="qtpworld2008@gmail.com";
		obj[0][1]="learn123";
		obj[0][2]="qtpworld2008 g";*/
		
		return obj;
	}
	@DataProvider(name="invalid_login")
	public static Object[][] DP_invalidlogin()
	{
		Object[][] obj=new Object[1][3];
		/*obj[0][0]="abcd";
		obj[0][1]="learn1234";
		obj[0][2]="Sorry we were unable to complete this step because :";*/
		List<String> xlData = getXLData("invalid_login");
		for (int i=0;i<xlData.size();i++)
		{
			obj[i][0] = xlData.get(i).split(";")[0];
			obj[i][1] = xlData.get(i).split(";")[1];
			obj[i][2] = xlData.get(i).split(";")[2];
		}
		
		return obj;
	}
	
	public static List<String> getXLData(String Scriptname)
	{
		ExcelHandlerGeneric xl=new ExcelHandlerGeneric("D:\\seleniumworkspace\\March2016\\src\\test\\resources\\Data.xlsx");
		String sheetname="Scenario_Login";
		int rowcount = xl.getrowcount(sheetname);
		List<String> list = new ArrayList<String>();
		for (int i=1;i<=rowcount;i++)
		{
			if (xl.getXLCellValue(sheetname, i, 2).equalsIgnoreCase("Y"))
			{
				if (xl.getXLCellValue(sheetname, i, 3).equalsIgnoreCase(Scriptname))
				{
					String uname = xl.getXLCellValue(sheetname, i, 4);
					String pwd = xl.getXLCellValue(sheetname, i, 5);
					String expected = xl.getXLCellValue(sheetname, i, 6);
					list.add(uname+";"+pwd+";"+expected);
					
				}
			}
		}
		
		return list;
	}
}
