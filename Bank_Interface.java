package day5;

import java.util.Scanner;

public class Bank_Interface {

	
	public static void main(String[] args) {
		//HDFC customer
		
	/*	HDFC hdfc = new HDFC();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.loan();
		hdfc.HappybonanzaHDFC();
		
		
		ICICI icici = new ICICI();
		icici.deposit();
		icici.withdraw();
		icici.loan();
		icici.Happybonanza();
		*/
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name");
		String bank = sc.next();
		sc.close();
		RBI banktype = null;
		if (bank.equalsIgnoreCase("ICICI"))
		{
			banktype = new ICICI();
		}
		else if (bank.equalsIgnoreCase("HDFC"))
		{
			banktype = new HDFC();
		}
		
		banktype.deposit();
		banktype.withdraw();
		banktype.loan();
		
		
		

	}

}
