package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
		// enter a search term
		//click the wikipedia link
		
		driver.findElement(By.name("q")).sendKeys("batticaloa"+Keys.ENTER);
		driver.get("https://en.wikipedia.org/wiki/Batticaloa_District");
		
		
		
		
	}

}
