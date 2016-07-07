package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Carwale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.carwale.com/");
		
		driver.findElement(By.id("gotItCoachMark")).click();
		
		driver.findElement(By.xpath("//li[contains(text(),'Used cars')]")).click();
		
		driver.findElement(By.id("budgetBtn")).click();
		
		List<WebElement> li = driver.findElement(By.id("minPriceList")).findElements(By.tagName("li"));
		/*for(WebElement e :li)
		{
			System.out.println(e.getText());
		}*/
		
		for (int i =0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		driver.close();
	}

}
