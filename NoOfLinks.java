package launch.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> count= driver.findElements(By.tagName("a"));
		int a =    count.size();
//		System.out.println(a);
		for(int i=0;i<a;i++)
		{
			WebElement single_link = count.get(i);
			String message = single_link.getText();
			System.out.println(message);
		}
		
	}

}
