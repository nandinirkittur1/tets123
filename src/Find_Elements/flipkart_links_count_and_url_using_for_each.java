package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart_links_count_and_url_using_for_each 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//links in flipkart
		//links consist of address of all matching elements
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//count number of links
		int count=links.size();
		System.out.println(count);	
		//flipkart links text
		for(WebElement we :links)
		{
			String url=we.getAttribute("href");
			System.out.println(url);
		}
	}
}
