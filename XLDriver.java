package day7;

public class XLDriver {

	
	public static void main(String[] args) {
		String path = "D:\\JavaWorkspace_2016\\March_2016_batch\\March_2016\\src\\test\\resources\\Age.xlsx";
		String sheetname = "Sheet1";
		ExcelHandlerGeneric xl = new ExcelHandlerGeneric(path);
		//Display all the cells in the excel
		 System.out.println("The number for rows in "+ sheetname+ " is "+ xl.getrowcount(sheetname));
		
		System.out.println("The number for columns in "+ sheetname+ " is "+ xl.getcolcount(sheetname));
		for(int i =1;i<=xl.getrowcount(sheetname);i++)
		{
			for(int j=0;j<xl.getcolcount(sheetname);j++)
			{
				String result = xl.getXLcellvalue(sheetname, i, j);
				System.out.print(result);
				System.out.print("            ");
			}
			System.out.println();
		}
		
		// Write to excel
		xl.writeXlcellvalue(sheetname,13,4,"Major");
		xl.saveXlfile(path);

	}

}
