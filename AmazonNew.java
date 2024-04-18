package launch.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNew {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement search =	driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	WebElement enter= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
        enter.click();
    Set<String> s1=       driver.getWindowHandles();
    System.out.println(s1);
          Iterator<String> i1=              s1.iterator();
             String parent=                  i1.next();
             String child = i1.next();
             driver.switchTo().window(child);
    //         Thread.sleep(2000);
      //       driver.close();
             
             WebElement add= driver.findElement(By.id("add-to-cart-button"));
             add.sendKeys(Keys.ENTER);
             WebElement cart = driver.findElement(By.xpath("(//a[@class='a-button-text'])[1]"));
             cart.sendKeys(Keys.ENTER);
	} 

}
