package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enter_data_for_odd_textbox_and_clear_count_by_using_for_loop 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/textbox.html");
		//links consist of address of all matching elements
		List<WebElement> text = driver.findElements(By.xpath("//input[@type='text']"));
		//count number of links
		int count=text.size();
		System.out.println(count);	
		//enter the data for odd tbox
		for(int i=0;i<=count-1;i=i+2)
		{
			text.get(i).sendKeys("Nandini");			
		}	
		Thread.sleep(3000);		
		//clears the data for odd tbox
		for(int i=0;i<=count-1;i=i+2)
		{			
			text.get(i).clear();
		}	
		
	}
}
