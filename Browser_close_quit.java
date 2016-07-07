package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_close_quit {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://in.rediff.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		//driver.close();
		driver.quit();

	}

}
