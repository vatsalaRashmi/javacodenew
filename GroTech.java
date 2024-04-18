package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTech {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.name("email")).sendKeys("vatsala0408@gmai.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.id("Present-Address")).sendKeys("Hyderabad");
		Thread.sleep(20000);
		driver.findElement(By.className("btn btn-primary")).click();
	}

}
