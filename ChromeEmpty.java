package launch.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEmpty {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
        String c = driver.getTitle();
         System.out.println(c);
	}

}
