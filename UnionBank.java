package demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnionBank {

	
	public static void main(String[] args) throws Exception {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the loan amount");
		String loanamount = in.next();
		System.out.println("Enter the rate amount");
		String rate = in.next();
		System.out.println("Enter the months amount");
		String months = in.next();
		
		String expected = "2224.44";
		//Open the firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Launch the url
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		//Identify Loan amount
		WebElement loan = driver.findElement(By.id("loanamount"));
		//Perform action on the webelement
		loan.sendKeys(loanamount);
		//Identify Interest 
		WebElement interest = driver.findElement(By.id("rate"));
		//Perform action on the webelement
		interest.sendKeys(rate);
		//Identify Tenure 
		WebElement tenure = driver.findElement(By.name("pmonths"));
		//Perform action on the webelement
		tenure.sendKeys(months);
		//Identify Calculate button
		WebElement Calculate = driver.findElement(By.id("Button1"));
		//Perform action on the webelement
		Calculate.click();
		//Identify Get emi 
		WebElement emi = driver.findElement(By.name("EMI"));
		//Perform action on the webelement
		String actual = emi.getAttribute("value");
		//VAlidate 
		
		if(actual.equals(expected))
		{
			System.out.println("The Test case has passed");
		}
		else
		{
			System.out.println("The Test case has failed");
		}
		Thread.sleep(5000);
		//Close the browser
		
		driver.close();
		in.close();
		
	}

}
