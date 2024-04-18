package launch.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class India {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		TakesScreenshot tss=     driver;
		   File source=   tss.getScreenshotAs(OutputType.FILE);
		//	File source=	   tss.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Fetch\\One.png");
		   FileHandler.copy(source, destination);
		   dr

	}

}
