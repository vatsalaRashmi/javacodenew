package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement searchtext = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
       searchtext.sendKeys("shoe");
       Thread.sleep(4000);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ARROW_DOWN);
       searchtext.sendKeys(Keys.ENTER);
        //  driver.switchTo().alert().accept();
     //  WebElement select = driver.findElement(By.linkText("https://www.myntra.com/shoe-accessories/kuber+industries/kuber-industries-set-of-10-non-woven-shoe-bags/28492874/buy"));
      // select.click();
       
       
	}

}
