package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Interface_Class implements Common_searchengineMethods_interface {
	WebDriver driver = null;
	@Override
	public void launchbrowser() {
		// open browser
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("http://google.com/");
		
	}

	@Override
	public void execute_search() throws InterruptedException {
		driver.findElement(By.partialLinkText("mail")).click();
		Thread.sleep(5000);
		
	}

	@Override
	public void tear_down() {
		driver.quit();
		
	}

}
