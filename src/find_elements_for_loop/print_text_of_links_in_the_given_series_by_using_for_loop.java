package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class print_text_of_links_in_the_given_series_by_using_for_loop 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//links consist of address of all matching elements
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//count number of links
		int count=links.size();
		System.out.println(count);	
		//enter the data for odd tbox
		for(int i=0;i<=count-1;i=i+50)
		{
			String text=links.get(i).getText();
			System.out.println(text);
		}			
	}
}
