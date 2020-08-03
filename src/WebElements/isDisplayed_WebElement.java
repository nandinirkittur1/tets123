package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDisplayed_WebElement 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/webelement.html");
		//Inspect Email/phone and enter value
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		//check whether the element is displayed or not
		boolean b=ele.isDisplayed();
		System.out.println(b);
		if(b)
		{
			System.out.println("tbox is displayed");
		}
		else
		{
			System.out.println("tbox is not displayed");
		}
		//wait for 3sec
		Thread.sleep(3000);
		//enters the data
		driver.findElement(By.xpath("//input[@type='text' and @value='abc']")).sendKeys("xyz");
		//wait for 3sec
		Thread.sleep(3000);		
		//Selects the entire data
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"a");
		//wait for 3sec
		Thread.sleep(3000);
		//clears the entire data
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DELETE);
		//wait for 3sec
		Thread.sleep(3000);
		//perform click action
		//driver.findElement(By.xpath("//a[@name='Gmail']")).sendKeys(Keys.ENTER);
		
		//wait for 3sec
		Thread.sleep(3000);
		//enters the data into text 
		driver.findElement(By.xpath("//input[@type='text' and @value='def']"));
		//wait for 3sec
		Thread.sleep(3000);
		//enters the data into text 2
		driver.findElement(By.xpath("//input[@type='text' and @value='xyz']"));		
		//wait for 3sec
		Thread.sleep(3000);
		//selects all the data from text 1
		driver.findElement(By.xpath("//input[@type='text' and @value='def']")).sendKeys(Keys.CONTROL+"a");
		//wait for 3sec
		Thread.sleep(3000);
		//cuts all the data from text 1
		driver.findElement(By.xpath("//input[@type='text' and @value='def']")).sendKeys(Keys.CONTROL+"c");
		//wait for 3sec
		Thread.sleep(3000);
		//clears the data from text 2
		driver.findElement(By.xpath("//input[@type='text' and @value='xyz']")).sendKeys(Keys.CONTROL+"a");
		//wait for 3sec
		Thread.sleep(3000);
		//copy the data into text 2
		driver.findElement(By.xpath("//input[@type='text' and @value='xyz']")).sendKeys(Keys.CONTROL+"v");
		
		
	}
}
