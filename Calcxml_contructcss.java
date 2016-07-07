package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calcxml_contructcss {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
FirefoxDriver driver = new FirefoxDriver();
		
		//Launch the browser
		driver.get("http://www.calcxml.com/calculators/mortgage-calculator?");
		//maximize
		driver.manage().window().maximize();
		//Find the loan amount
		WebElement loan = driver.findElement(By.cssSelector("input[id='loanAmount']"));
		//Enter the loan amount 
		loan.clear();
		loan.sendKeys("100000");
		//Find the the interest 
		WebElement interest = driver.findElement(By.cssSelector("#interestRate"));
		//Enter the interest
		interest.clear();
		interest.sendKeys("12");
		
		//find the tenure
		WebElement tenure = driver.findElement(By.cssSelector("input[id='termMonths'][name='termMonths']"));
		//Enter the tenure
		tenure.clear();
		tenure.sendKeys("60");
		//Find the Submit button
		//WebElement submit = driver.findElement(By.cssSelector(".pure-button.pure-button-primary"));
		//WebElement submit = driver.findElement(By.cssSelector(".pure-button-primary"));
		WebElement submit =driver.findElement(By.cssSelector("button[class = 'pure-button pure-button-primary']"));
		//Click on the submit button
		submit.click();	
		
		Thread.sleep(4000);
		//Find the result element
		WebElement result = driver.findElement(By.cssSelector(".resultText"));
		//Extract the emi out of the result
		String emi_result = result.getText();
		System.out.println("The result is "+emi_result);
		//String[] array = emi_result.split(" ");
		//System.out.println("The actual emi is "+ array[5]);
		
		String emi = emi_result.split(" ")[5];
		System.out.println("The actual emi is "+ emi);
		//Close browser
		driver.close();

	}

}
