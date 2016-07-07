package day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnWebTable {
	
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.homeloanshub.com/mortgage-calculator/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.close();
	}
	
	@Test (dataProvider="DP")
	public void homeloan(String principle, String interest, String year)
	{
		String emi = null;
		driver.findElement(By.name("principal")).sendKeys(principle);
		driver.findElement(By.name("interest")).sendKeys(interest);
		driver.findElement(By.name("tenure")).sendKeys(year);
		
		int tenure = Integer.parseInt(year);
		tenure = tenure*12;
		driver.findElement(By.className("btn1")).click();
		
		List<WebElement> element = driver.findElements(By.xpath(".//div[@id='emiresults']/table/tbody/tr"));
		System.out.println(element.size()); //this will give the number rows 6
		
		/*List<WebElement> element = driver.findElements(By.xpath(".//div[@id='emiresults']/table/tbody/tr/td"));
		System.out.println(element.size()); // will the number cells 24
*/	
		/*List<WebElement> element = driver.findElements(By.xpath(".//div[@id='emiresults']/table/tbody/tr[2]/td"));
		System.out.println(element.size());//find your columns 4
*/		for(int i = 2;i<=element.size();i++)
			{
				String result =driver.findElement(By.xpath(".//div[@id='emiresults']/table/tbody/tr["+i+"]/td[1]")).getText();
				//System.out.println(result);
				int res = Integer.parseInt(result);
				if(tenure==res)
				{
					 emi =driver.findElement(By.xpath(".//div[@id='emiresults']/table/tbody/tr["+i+"]/td[2]")).getText();
					 break;
				}
				
				
			}

			System.out.println("The emi for "+tenure+" month is " + emi);


		
	}
	
	@DataProvider(name = "DP")
	public Object[][] DP_webtable()
	{
		Object[][] obj = new Object[2][3];
		
		obj[0][0]= "100000";
		obj[0][1]= "12";
		obj[0][2]= "5";
		
		obj[1][0]= "200000";
		obj[1][1]="13";
		obj[1][2]="4";
		
		return obj;
	}
	
	
	
	
	

}
