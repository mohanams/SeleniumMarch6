package day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {

	
	public static void main(String[] args) {
		//Find my excel
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		String celltext = null;
		try {
			 fis = new FileInputStream("D:\\JavaWorkspace_2016\\March_2016_batch\\March_2016\\src\\test\\resources\\Age.xlsx");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			 wb = new XSSFWorkbook(fis);
			 fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		if(wb!=null)
		{
			System.out.println("Excel connection successfull");
		}
		
		
		//get row 5, column 1 -expected david
		XSSFCell cell = wb.getSheet("Sheet1").getRow(4).getCell(1);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		{
			 celltext = cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			double numericCellValue = cell.getNumericCellValue();
			 celltext = String.valueOf(numericCellValue);
		}
		
		
		System.out.println(celltext);

	}

}




