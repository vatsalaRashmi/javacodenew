package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CntrlGroTechMinds {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("(//textarea)[4]"));
		           search.sendKeys("hyderabad");
		           search.sendKeys(Keys.CONTROL+"a");
		           search.sendKeys(Keys.CONTROL+"c");
		WebElement search1= driver.findElement(By.xpath("(//textarea)[5]"));
		           search1.sendKeys(Keys.CONTROL+"v");
		           
		WebElement upload =           driver.findElement(By.id("file"));
		upload.sendKeys("C:\\Users\\Admin\\OneDrive - Sonata Software\\Documents\\2022-07-19.xls");
		

	}

}
