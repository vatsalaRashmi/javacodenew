package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLXpath {

	public static void main(String[] args)  {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("vatsala");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("new");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("1234");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("vatsala");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("rashmi");
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		
				
				

	}

}
