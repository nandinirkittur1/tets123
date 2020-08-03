package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class select_all_checkbox_forward_and_deselect_reverse_count_by_using_for_loop 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/checkboxes.html");
		//links consist of address of all matching elements
		List<WebElement> chbox = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		//count number of links
		int count=chbox.size();
		System.out.println(count);	
		//selects forward
		for(int i=0;i<=count-1;i++)
		{
			chbox.get(i).click();
		}
		//de selects backforward
		for(int i=count-1;i>=0;i--)
		{
			chbox.get(i).click();
		}
	}
}
