package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sbi_xpath_firebug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Open the browser
		
				FirefoxDriver driver  = new FirefoxDriver();
				driver.manage().window().maximize();
				
				//launch URL
				
				driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
				
				//find the loan amount
				
				WebElement loan = driver.findElement(By.xpath("//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[1]/input"));
				//Enter the value to the loan
				loan.sendKeys("100000");
				
				//Find the interest
				WebElement interest = driver.findElement(By.xpath("//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[3]/input"));
				//enter the value for the interest
				
				interest.sendKeys("12");
				
				//find the tenure
				WebElement tenure = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[2]/input"));
				//enter the tenure
				
				tenure.sendKeys("60");
				
				//Find the calculate button
				WebElement calc = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[3]/td/p/input[1]"));
				//click the calculate button
				calc.click();
				
			/*	find the emi
				web element*/
				
				WebElement emi = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[2]/p[1]/input"));
			
//				get the emi from the textbox
				
				String actual = emi.getAttribute("value");
				System.out.println(" The emi is "+ actual);
				
				//close the browser
				driver.close();

	}

}
