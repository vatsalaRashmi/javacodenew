package launch.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException  {
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			List<WebElement> count= driver.findElements(By.tagName("a"));
			int a =    count.size();
//			System.out.println(a);
			for(int i=0;i<a;i++)
			{
				WebElement single_link = count.get(i);
		//		String message =single_link.getText();
	//			System.out.println(message);
				String url = single_link.getAttribute("href");
				System.out.println(url);
			//	System.out.println(single_link);
	   	verify_the_link(url);
				
			}
	}
		
	

    static void verify_the_link(String url) throws IOException 
     {
    	 URL u1 = new URL(url);
    HttpURLConnection h1=	(HttpURLConnection) u1.openConnection();
    h1.connect();
    if(h1.getResponseCode()==200)
    {
    	System.out.println("link is valid" +url);
    }
    else
    {
    	System.out.println("link is invalid" +url);
    }
     
    
	
     }
}



