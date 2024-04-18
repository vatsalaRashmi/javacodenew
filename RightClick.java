package launch.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.linkText("Gmail"));
    Actions a1= new Actions(driver);
    a1.contextClick(e1).perform();
    Robot r1= new Robot();
    r1.keyPress(KeyEvent.VK_DOWN);
    
    
    r1.keyPress(KeyEvent.VK_KP_DOWN);
    r1.keyPress((KeyEvent.VK_ENTER);
    
    
	}

}
