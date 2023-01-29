package selenium;

import java.awt.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//find x,y value
		WebElement PositionBtn = driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint = PositionBtn.getLocation();
		int xvalue=xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("x value is:"+ xvalue + "y value is:"+yvalue);
		
		//find color
		WebElement getClr = driver.findElement(By.id("color"));
		String color=getClr.getCssValue("background-color");
		System.out.println("button color is:"+color);
		
		
		//find height,width value
		WebElement sizeBtn = driver.findElement(By.id("size"));
		int height = sizeBtn.getSize().getHeight();
		int width = sizeBtn.getSize().getWidth();
		System.out.println("height value is:"+ height + "width value is:"+width);
		
		//when click the btn go to home page
		WebElement homeBtn = driver.findElement(By.id("home"));
		homeBtn.click();
		
	
	}

}
