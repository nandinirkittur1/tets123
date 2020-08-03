package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class select_all_checkbox_and_count_by_using_for_each 
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
		//flipkart links text
		for(WebElement we :chbox)
		{
			we.click();
		}
	}
}
