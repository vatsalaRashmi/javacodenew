package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
	WebElement r =	driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
	WebElement p = driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));
Actions a1= new Actions(driver);
a1.dragAndDrop(r, p).perform();
a1.doubleClick(r).perform();
	}

}
