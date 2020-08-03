package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear_text_data_without_using_clear_method 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/clear_text_data_without_using_clear.html");
		//Inspect Email/phone and enter value
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		ele.sendKeys(Keys.DELETE);	
		
	}
}
