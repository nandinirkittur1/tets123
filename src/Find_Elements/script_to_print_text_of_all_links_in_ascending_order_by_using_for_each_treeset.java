package Find_Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_to_print_text_of_all_links_in_ascending_order_by_using_for_each_treeset 
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
		//sorts the data in asc order by default
		TreeSet<String> l=new TreeSet<String>();
		for(WebElement we :links)
		{
			String text=we.getText();
			l.add(text);
		}
		//Collections.sort(l);
		//to get line by line
		for(String t:l)
		{
			System.out.println(t);
		}
		
	}
}
