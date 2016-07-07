package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleopenclose {
	
	//Open browser
	
	//launch browser
	
	//close browser
	FirefoxDriver driver ;
	public Googleopenclose(String url)
	{
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void selectlink(String linktext) throws InterruptedException
	{
		driver.findElement(By.linkText(linktext)).click();
		Thread.sleep(4000);
	}
	
	public void tear_down()
	{
		driver.close();
	}
	
	

}
