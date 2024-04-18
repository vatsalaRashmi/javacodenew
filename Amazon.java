package launch.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();*/
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dmobiles%26crid%3D220S5N7BGR5P1%26sprefix%3Dmobiles%252Caps%252C518%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0p");
        Thread.sleep(30000);
		driver.findElement(By.id("ap_email")).sendKeys("rashmi.vatsala@gmail.com");
        driver.findElement(By.id("continue")).click();
        
        List<WebElement> =  driver.findElements(null)
	}

}
