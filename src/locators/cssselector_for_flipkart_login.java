package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector_for_flipkart_login 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/flip_kart.html");
		//ele contains the address of the element of tagname "a"
		
		driver.findElement(By.cssSelector("input[id='a1']")).sendKeys("kitturnandini7@gmail.com"); //Enter data into UN text field
		driver.findElement(By.cssSelector("input[id='a2']")).sendKeys("nandinirkittur"); //Enter data into PWD text field
		Thread.sleep(3000);//wait for 3sec
		driver.findElement(By.cssSelector("a[id='a4']")).click(); //click on link
			
	}
}
