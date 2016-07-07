package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	WebDriver driver ;
	public void launchbrowser(String URL)
	{
			// open browser
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				//launch url
				driver.get(URL);
	}
	
	public void tear_down()
	{
		driver.quit();
	}

}
