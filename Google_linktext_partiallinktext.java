package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_linktext_partiallinktext {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//open the browser
		
		FirefoxDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("mail")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
