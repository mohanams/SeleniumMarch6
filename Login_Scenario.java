package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Generic.Base_Class;

public class Login_Scenario extends Base_Class{
	
	
	
	@Test(dataProvider="valid_login",dataProviderClass=DataProviders.Login_DP.class)
	public void valid_login(String uname,String pwd,String expected)
	{
		
		//String expected="qtpworld2008 g";
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("logid")).sendKeys(uname);
		driver.findElement(By.name("pswd")).sendKeys(pwd);
		driver.findElement(By.cssSelector("td[class='sb1'] input")).click();
		String Actual = driver.findElement(By.xpath("//a[@href='http://mypage.rediff.com/profile/myprofile']")).getText();
		if (Actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test case has passed");
		}
		else
		{
			System.out.println("Test case has failed");
		}
		
		
	}
	
	@Test(dataProvider="invalid_login",dataProviderClass=DataProviders.Login_DP.class)
	public void invalid_login(String uname,String pwd,String expected)
	{
		//String expected="Sorry we were unable to complete this step because :";
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("logid")).sendKeys(uname);
		driver.findElement(By.name("pswd")).sendKeys(pwd);
		driver.findElement(By.cssSelector("td[class='sb1'] input")).click();
		String Actual = driver.findElement(By.xpath("//b[contains(text(),'Sorry we were unable to complete this step because :')]")).getText();
		if (Actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test case has passed");
		}
		else
		{
			System.out.println("Test case has failed");
		}
		
	}

}
