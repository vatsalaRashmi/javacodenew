package launch.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Sbi {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
        driver.navigate().refresh();
       
        
        driver.manage().window().maximize();
		WebElement acnt_no=     driver.findElement(By.name("accountNo"));
	acnt_no.sendKeys("123456");
	   WebElement cif_no = driver.findElement(By.name("cifNo"));
	   cif_no.sendKeys("54321");
	   WebElement branchcode = driver.findElement(By.name("branchCode"));
	   branchcode.sendKeys("SIB0001");
	   WebElement country = driver.findElement(By.id("selCountry"));
	   Select s1= new Select(country);
	   s1.selectByValue("91");
	   WebElement cntrycode = driver.findElement(By.name("mobileNo"));
	   cntrycode.sendKeys("9876543210");
	   WebElement facility = driver.findElement(By.name("txnRights"));
	   Select s2 = new Select(facility);
	   s2.selectByValue("08");
	   WebElement nfg = driver.findElement(By.name("captchaValue"));
	   nfg.sendKeys("D8CD5");
	   WebElement abc = driver.findElement(By.name("I Agree"));
	   abc.click();
	   WebElement def = driver.findElement(By.name("Submit"));
	   def.click();
//	   TakesScreenshot tss=     driver;
	//   File source=   tss.getScreenshotAs(OutputType.FILE);
	//	File source=	   tss.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Fetch\\One.png");
	//   FileHandler.copy(source, destination);
	   
	   
	   
	
	}

}
