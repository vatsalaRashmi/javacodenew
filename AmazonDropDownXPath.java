package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDownXPath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd =driver.findElement(By.xpath("(//select)[1]"));
		Select s1= new Select(dd);
	//	s1.selectByIndex(2);
	//	s1.selectByVisibleText("Amazon Fresh");
		s1.selectByValue("search-alias=aps");
		

	}

}
