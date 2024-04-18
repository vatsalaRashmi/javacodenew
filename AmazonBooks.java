package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBooks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement dd=	driver.findElement(By.xpath("(//select)[1]"));
	
	Select s1 = new Select(dd);
	s1.selectByVisibleText("Books");
	WebElement search=         driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
			search.sendKeys("world");
//	WebElement 	click=	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	//	click.click();
			search.sendKeys(Keys.ENTER);
			
	WebElement firstimg=		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
	
		firstimg.click();
		
		
	}

}
