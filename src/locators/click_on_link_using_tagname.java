package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_on_link_using_tagname 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/sample1.html");
		//ele contains the address of the element of tagname "a"
		
		driver.findElement(By.name("n1")).sendKeys("username");
		driver.findElement(By.name("n2")).sendKeys("password");
		driver.findElement(By.id("a3")).click();
		driver.findElement(By.className("c4")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("n1")).clear();
		driver.findElement(By.name("n2")).clear();
		//driver.findElement(By.id("a3")).clear();
		//driver.findElement(By.className("c4")).clear();
		Thread.sleep(3000);		
		//Click on facebook element link
		driver.findElement(By.id("a8")).click();
		
	}
}
