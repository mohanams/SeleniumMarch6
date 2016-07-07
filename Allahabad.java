package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allahabad {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the expected");
		String expected = in.next();
		System.out.println("Enter the amount");
		String amount = in.next();
		System.out.println("Enter the rate");
		String interest = in.next();
		System.out.println("Enter the tenure");
		String months = in.next();
		in.close();
		//String expected = "2224.44";
		//Open firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
		//Find the element loan textbox
		WebElement loan = driver.findElement(By.name("principal"));
		//Enter value into loan textbox
		loan.sendKeys(amount);
		//Find the element rate textbox
		WebElement rate = driver.findElement(By.name("interest"));
		//Enter the value into rate textbox
		rate.sendKeys(interest);
		
		//Find the element tenure textbox
		WebElement tenure = driver.findElement(By.name("instalment"));
		//Enter the value into the tenure textbox
		tenure.sendKeys(months);
		
		//Find the element calculate button
		WebElement calc = driver.findElement(By.name("B1"));
		//Click on the calculate button
		calc.click();
		//Find the emi textbox
		WebElement emi = driver.findElement(By.name("total"));
		
		//Get the value from the emi textbox
		String actual = emi.getAttribute("value");
		System.out.println("The emi is "+actual);
		//Validate
		if(actual.equals(expected))
		{
			System.out.println("Test case has passed");
		}
		else
		{
			System.out.println("Test case has failed");
		}
		//Close the browser
		
		driver.close();

	}

}
