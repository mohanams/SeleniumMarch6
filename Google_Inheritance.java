package day5;

import org.openqa.selenium.By;


public class Google_Inheritance extends Base_class {

	public void googleExecute() throws InterruptedException {
		//open the browser
		
	
		
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("mail")).click();
		Thread.sleep(5000);
		

	}

}
