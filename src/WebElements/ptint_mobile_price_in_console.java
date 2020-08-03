package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ptint_mobile_price_in_console 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("https://www.flipkart.com");
		//inspect search button
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//Inspect search text box
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("redmi note 7 pro (space black, 64 gb)");
		//inspect search button
		driver.findElement(By.xpath("//button[@class='vh79eN' and @type='submit']")).click();
		//inspect the price of an element
		WebElement ele=driver.findElement(By.xpath("(//div[.='Redmi Note 7 Pro (Space Black, 64 GB)']/../following-sibling::div[1]/div[1]/div[1]/div[1])[1]"));
		//check whether the element is displayed or not
		String price=ele.getText();
		System.out.println(price);
	}
}
