package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {
	
	FirefoxDriver driver = null;
	
	public HandlingAlerts(String url)
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void handlealertmessages() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	
	public void tear_down()
	{
		driver.quit();
	}
	
	public void runsequence() throws InterruptedException
	{
		handlealertmessages();
		tear_down();
	}

}









