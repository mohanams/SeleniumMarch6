package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("D://xyz//x.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			System.out.println(" This statement is inside the try block");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("The statement is inside the finally block");
		}
		
		System.out.println("The statement is outside try catch block");

	}

}
