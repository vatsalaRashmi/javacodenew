package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeJSONXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a")).click();

	}

}
