package day5;

public class InheritanceWebDriver {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Executing bing test case
		bing_inheritance bing = new bing_inheritance();
		bing.launchbrowser("http://www.bing.com/");
		bing.bingExecute();
		bing.tear_down();
		
		//execute google test case
		
		Google_Inheritance obj_google = new Google_Inheritance();
		
		obj_google.launchbrowser("http://google.com/");
		obj_google.googleExecute();
		obj_google.tear_down();

	}

}
