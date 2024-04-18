package launch.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
	WebElement	Choice1= driver.findElement(By.name("Choice1"));
	Select s1 = new Select(Choice1);
	 List<WebElement> l1=   s1.getOptions();
	int a= l1.size();
	System.out.println(a);

	}

}
