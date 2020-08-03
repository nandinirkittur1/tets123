package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isEnabled_WebElement 
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
		boolean b=ele.isEnabled();
		System.out.println(b);
		if(b)
		{
			System.out.println("tbox is enabled");
		}
		else
		{
			System.out.println("tbox is not enabled");
		}
		//wait for 3sec
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");// it will through ElementNotInteractable exception(Selenium RTE)
			
	}
}
