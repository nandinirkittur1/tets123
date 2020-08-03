package Drop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class count_number_of_options 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		//wait for 3s
		Thread.sleep(3000);
		//object creation
		Select s=new Select(ele);	
		//get address of all options
		List<WebElement> options = s.getOptions();
		int count=options.size();
		System.out.println(count);		
	}
	
}
