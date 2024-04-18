package launch.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("mouse");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		WebElement second= driver.findElement(By.xpath("(//div[@class='CXW8mj'])[2]"));
		second.click();
		Set<String> s1=   driver.getWindowHandles();
        Iterator<String> i1=                  s1.iterator();
              String parent=       i1.next();
              String child = i1.next();
              Thread.sleep(2000);
              driver.switchTo().window(parent);
              driver.close();
              driver.switchTo().window(child);
              TakesScreenshot tss = driver;
           File source=   tss.getScreenshotAs(OutputType.FILE);
           File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Fetch\\GroTechMinds.png");
           FileHandler.copy(source, destination);
           driver.close();
	}

}
