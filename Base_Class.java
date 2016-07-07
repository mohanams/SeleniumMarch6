package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	
	public WebDriver driver=null;
	@BeforeMethod
	public void launchBrowser()
	{
		
		String Browsertype="firefox";
		if(Browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\seleniumworkspace\\March2016\\src\\test\\resources\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(Browsertype.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\seleniumworkspace\\March2016\\src\\test\\resources\\IEDriverServer.exe");
			driver=new ChromeDriver();
		}
		else if(Browsertype.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://books.rediff.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}

}
