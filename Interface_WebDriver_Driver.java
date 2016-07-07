package day5;

import java.util.Scanner;

public class Interface_WebDriver_Driver {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// execute test case
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the searchengine");
		String engine = in.next();
		in.close();
		Common_searchengineMethods_interface search_engine = null;
		if(engine.equalsIgnoreCase("google"))
		{
			search_engine = new Google_Interface_Class();
		}
		else if (engine.equalsIgnoreCase("bing"))
		{
			search_engine =new Bing_Interface_Class();
		}
		
		search_engine.launchbrowser();
		search_engine.execute_search();
		search_engine.tear_down();
	}

}
