package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("shoes");
		driver.findElement(By.xpath("(//input)[6]")).click();
		driver.findElement(By.xpath("(//img)[7]")).click();

	}

}
