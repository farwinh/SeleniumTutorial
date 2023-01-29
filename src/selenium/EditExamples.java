package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//apsalute path syampol /
		// realtive apth syampl //
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("fathimafarwin588@gmail.com");
		
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.clear();
		appendBox.sendKeys("win");
		
		WebElement getTextBoxdriver = driver.findElement(By.name("username"));
		String value =getTextBoxdriver.getAttribute("value");
		System.out.println("value");
		
		WebElement clearButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearButton.clear();
		
		WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled =disableBox.isEnabled();
		System.out.println(enabled);

	}

}
