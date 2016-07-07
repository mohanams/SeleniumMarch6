package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Learninggrid {
	RemoteWebDriver driver = null;
	//String browsertype = "chrome";
	@Test
	@Parameters({"browsertype"})
	public void Gridtesting(String browsertype) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		if(browsertype.equalsIgnoreCase("firefox"))
		{
			cap.setBrowserName("firefox");
		}		
		else if(browsertype.equalsIgnoreCase("chrome"))
		{
			cap.setBrowserName("chrome");
		}
		else if(browsertype.equalsIgnoreCase("ie"))
		{
			cap.setBrowserName("internet explorer");
		}
		cap.setPlatform(Platform.WINDOWS);
		URL url =new URL("http://192.168.0.101:4444/wd/hub");
		 driver = new RemoteWebDriver(url,cap);
		 
		 
		 driver.get("http://books.rediff.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Sign In")).click();
		 driver.findElement(By.name("logid")).sendKeys("qtpworld2008@gmail.com");
		 driver.findElement(By.name("pswd")).sendKeys("learn123");
		 driver.findElement(By.cssSelector("td[class = 'sb1'] input")).click();
		 driver.findElement(By.linkText("Sign Out")).click();
		 driver.close();
		 
		 //logid pswd sb1
	}

}
