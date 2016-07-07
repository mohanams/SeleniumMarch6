package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.snapdeal.com/");
		
		
		
		driver.findElement(By.className("sd-icon-delete-sign")).click();
		
		/*List<WebElement> span_tags = driver.findElements(By.className("catText"));
		
		for(WebElement e :span_tags)
		{
			System.out.println(e.getText());
		}*/
		
		/*List<WebElement> elements = driver.findElements(By.className("navlink"));
		for(WebElement e :elements)
		{
			System.out.println(e.findElement(By.cssSelector("span[class='catText']")).getText());
		}*/
		
		/*List<WebElement> elements = driver.findElements(By.className("navlink"));
		for(WebElement e :elements)
		{
			System.out.println(e.findElement(By.cssSelector(".leftCategoriesProduct span:nth-child(3)")).getText());
			
		}*/
		
		List<WebElement> li = driver.findElements(By.className("navlink"));
		for(WebElement e :li)
		{
			List<WebElement> span = e.findElements(By.tagName("span"));
			for(WebElement x : span)
			{
				if(!x.getText().isEmpty())
				{
					System.out.println(x.getText());
				}
			}
		}
		
		driver.close();

	}

}
