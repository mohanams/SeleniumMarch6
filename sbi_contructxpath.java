package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sbi_contructxpath {

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
				
				//WebElement loan = driver.findElement(By.xpath("//input[@class = 'textbox'][@name='uamount']"));
				//backward traverse
				WebElement loan = driver.findElement(By.xpath("//input[@class = 'textbox'][@name='uTime']/../../p/input"));
				//Enter the value to the loan
				loan.sendKeys("100000");
				
				//Find the interest
				WebElement interest = driver.findElement(By.xpath("//input[@class = 'textbox'][@name='uRate']"));
				//enter the value for the interest
				
				interest.sendKeys("12");
				
				//find the tenure
				WebElement tenure = driver.findElement(By.xpath("//input[@class = 'textbox'][@name='uTime']"));
				//enter the tenure
				
				tenure.sendKeys("60");
				
				//Find the calculate button
				WebElement calc = driver.findElement(By.xpath("//table[@class='commontable']/tbody/tr[3]/td/p/input"));
				//click the calculate button
				calc.click();
				
			/*	find the emi
				web element*/
				
				//WebElement emi = driver.findElement(By.xpath("//input[starts-with(@name ,'uEm')]"));
				//WebElement emi = driver.findElement(By.xpath("//input[contains(@name ,'Em')]"));
				WebElement emi = driver.findElement(By.xpath("//input[@name='uEmi']"));
				//get the emi from the textbox
				
				String actual = emi.getAttribute("value");
				System.out.println(" The emi is "+ actual);
				
				//close the browser
				driver.close();

	}

}
