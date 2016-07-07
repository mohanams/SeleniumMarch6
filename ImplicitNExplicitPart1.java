package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitNExplicitPart1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String value = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println(value);
		//Thread.sleep(5000);
		WebDriverWait sync = new WebDriverWait(driver, 5);
		
		sync.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmeil")));
		
		driver.findElement(By.linkText("Gmeil")).click();
		
		
		
		

	}

}
