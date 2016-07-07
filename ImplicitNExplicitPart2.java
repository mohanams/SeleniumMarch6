package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitNExplicitPart2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.bigbasket.com/choose-city/?next=/");
		
		driver.findElement(By.id("skip_explore")).click();
		driver.findElement(By.id("id_q")).sendKeys("Orange");
		//Thread.sleep(4000);
		WebDriverWait sync = new WebDriverWait(driver,5);
		
		sync.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a:nth-child(2)")));
		driver.findElement(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a:nth-child(2)")).click();
		driver.close();
	}

}
