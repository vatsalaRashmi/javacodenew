package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindsAll {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rashmi.vatsala@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.id("Female")).click();
	WebElement dd=	driver.findElement(By.xpath("(//select)[6]"));
	Select s1= new Select(dd);
	s1.selectByVisibleText("Technical Skills");
	WebElement dd1=	driver.findElement(By.xpath("(//select)[9]"));
	Select s2= new Select(dd1);
	s2.selectByValue("India");
		driver.findElement(By.name("Present-Address")).sendKeys("Hyderabad");
		driver.findElement(By.id("Permanent-Address")).sendKeys("hyderbad");
		driver.findElement(By.name("Pincode")).sendKeys("123456");
		
		WebElement dd2=	driver.findElement(By.xpath("(//select)[10]"));
		Select s3= new Select(dd2);
		s3.selectByIndex(1);
		driver.findElement(By.id("relocate")).click();
		
		

	}

}
