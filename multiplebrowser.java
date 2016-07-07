package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multiplebrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expected = "2224.44";
		//Open firefox browser
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//run in internet explorer
		/*System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\March_2016_batch/March_2016/src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();*/
		//run in chrome
		/*System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016\\March_2016_batch/March_2016/src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		
		String browsertype = "chrome";
		
		WebDriver driver = null;
		
		
		if (browsertype.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\March_2016_batch/March_2016/src/test/resources/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else if (browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016\\March_2016_batch/March_2016/src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browsertype.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		//Launch Union bank URL
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		//find the element for loan amount textbox
		WebElement loan = driver.findElement(By.id("loanamount"));
		//Enter some value into the loan amount textbox
		loan.sendKeys("100000");
		//find the element for the interest rate textbox
		WebElement rate = driver.findElement(By.id("rate"));
		//Enter some value into the interest rate textbox
		rate.sendKeys("12");
		//Find the element for the ternure textbox
		WebElement tenure = driver.findElement(By.name("pmonths"));
		//Enter some value in to the tenrure textbox
		tenure.sendKeys("60");
		//Find the element for Calculate button 
		WebElement calc = driver.findElement(By.id("Button1"));
		//Click on the Calculate button
		calc.click();
		//Find th element for the Emi textbox
		WebElement emi = driver.findElement(By.id("EMI"));
		//Extract data from the emi textbox
		String actual = emi.getAttribute("value");
		System.out.println("The emi is "+ actual);
		// Validation
		if (actual.equals(expected))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		//Close my browser
		driver.close();

	}

}
