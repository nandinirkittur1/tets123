package Drop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class script_to_select_all_options_and_deselect_all_options 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/dropdown.html");
		WebElement ele=driver.findElement(By.id("Adigas"));
		//wait for 3s
		Thread.sleep(3000);
		//object creation
		Select s=new Select(ele);	
		//get address of all options
		List<WebElement> options = s.getOptions();
		int count=options.size();
		System.out.println(count);
		//select all the options
		for (int i=0;i<=count-1;i++)
		{
			s.selectByIndex(i);
		}
		Thread.sleep(3000);
		//check for is multiple
		boolean b=s.isMultiple();
		System.out.println(b);
		if(b)
		{		
			s.deselectAll();
			System.out.println("Multi select drop down");
		}
		else
		{
			System.out.println("single select drop down");
		}			
	}
}
