package Find_Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_to_print_text_of_all_links_in_descending_order_by_using_for_loop_array_list 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//count of links
		int count=links.size();
		System.out.println(count);
		ArrayList<String> l=new ArrayList<String>();
		for(int i=0;i<=count-1;i++)
		{
			String text=links.get(i).getText();
			l.add(text);
		}
		Collections.sort(l,Collections.reverseOrder());
		//to get line by line
		for(int i=0;i<=count-1;i++)
		{
			String t=l.get(i);					
			System.out.println(t);
		}		
	}
}
