package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnTagname {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		String expected = "about";
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//Find all the elements having tagname as 'a'
		
		List<WebElement> array = driver.findElements(By.tagName("a"));
		System.out.println(" The number of links in the google page is "+ array.size());
		
	/*	for(int i =0;i<array.size();i++)
		{
			System.out.println(array.get(i).getText());
			if(array.get(i).getText().equalsIgnoreCase("about"))
			{
				System.out.println(" the about link is found " +array.get(i).getText());
				array.get(i).click();
				break;
			}
		}*/
		
		for(WebElement e : array)
		{
			if (e.getText().equalsIgnoreCase(expected))
			{
				System.out.println(" The link has been found for "+ e.getText());
				e.click();
				break;
			}
			
		}
		Thread.sleep(4000);
		
		driver.close();
	
	}

}
