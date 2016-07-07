package day8;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandler {
	
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://in.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.close();
	}
	
	@Test
	public void handlewindow() throws InterruptedException
	{
		String parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(parentwindow);
		System.out.println(windows.size());
		for(String x:windows)
		{
			if(!x.equals(parentwindow))
			{
				driver.switchTo().window(x);
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(3000);
	}
	

}
