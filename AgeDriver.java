package day7;

public class AgeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create connection with the excel and store it to wb
		String path = "D:\\JavaWorkspace_2016\\March_2016_batch\\March_2016\\src\\test\\resources\\Age.xlsx";
		String sheetname = "Sheet1";
		ExcelHandlerGeneric xl  = new ExcelHandlerGeneric(path);
		
		//Read age column
		int rowcount = xl.getrowcount(sheetname);
		for(int i =1;i<=rowcount;i++)
		{
			String age = xl.getXLcellvalue(sheetname, i, 1);
			
			//System.out.println(age);
			age=age.replace(".0", "");
			//System.out.println(age);
			
			Integer age_actual = Integer.valueOf(age);
			if(age_actual>17)
			{
				xl.writeXlcellvalue(sheetname, i, 2, "Major");
			}
			else 
			{
				xl.writeXlcellvalue(sheetname, i, 2, "Minor");
			}
			
		}
		xl.saveXlfile(path);
	}

}
