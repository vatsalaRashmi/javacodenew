package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
	WebElement click=	driver.findElement(By.xpath("//button[@class='btnjs']"));
	click.sendKeys(Keys.ENTER);
		driver.switchTo().alert().accept();
		

	}

}
