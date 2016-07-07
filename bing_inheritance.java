package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class bing_inheritance extends Base_class{

	/**
	 * @param args
	 */
	public void bingExecute()  {
		
		//find search textbox
		WebElement search = driver.findElement(By.id("sb_form_q"));
		//Enter search keyword
		search.sendKeys("Selenium");
		//find search icon
		WebElement search_icon = driver.findElement(By.id("sb_form_go"));
		//Click on the search button
		search_icon.click();
		//find the result
		WebElement result = driver.findElement(By.className("sb_count"));
		//get the result
		String actual = result.getText();
		System.out.println(actual);
		//extract the number from the result
		String actual_value = actual.replace(" RESULTS","" );
		System.out.println("The result is " +actual_value);
		//close the browser
		
	}

}
