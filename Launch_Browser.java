package launch.selenium;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String c =driver.getTitle();
		System.out.println(c);
		String b = c.toLowerCase();
		System.out.println(b);
		String texttile[]= b.split(" ");
		for(int i=0;i<texttile.length;i++)
		{
			String word= texttile[i];
			System.out.println(word);
		}
		
		
	    driver.close();
	   
	
			
		}
	}
