package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class font_size_and_count_of_textbox_by_using_for_loop 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/textbox.html");
		//links in flipkart
		//links consist of address of all matching elements
		List<WebElement> font = driver.findElements(By.xpath("//input[@type='text']"));
		//count number of links
		int count=font.size();
		System.out.println(count);	
		//flipkart links text
		for(int i=0;i<=count-1;i++)
		{
			WebElement we=font.get(i);
			String font_size=we.getCssValue("font-size");
			System.out.println(font_size);
		}
	}
}
