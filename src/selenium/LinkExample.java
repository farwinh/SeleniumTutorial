package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.get("https://www.ruh.ac.lk/index.php/en/");
		
		driver.findElement(By.linkText("Library")).click();
		
		
		
		
		
		
	}

}
