package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector_locator 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/sample3.html");
		//ele contains the address of the element of tagname "a"
		
		driver.findElement(By.cssSelector("a[id='a8']")).click(); //CLICK ON RADIO BUTTON
		driver.findElement(By.cssSelector("a#a8")).click(); //CLICK ON RADIO BUTTON
		driver.findElement(By.cssSelector("a[class='c6']")).click(); //CLICK ON RADIO BUTTON
		driver.findElement(By.cssSelector("a.c6")).click(); //CLICK ON RADIO BUTTON
		driver.findElement(By.cssSelector("a[href='https://www.google.com']")).click(); //click on link
		
			
	}
}
