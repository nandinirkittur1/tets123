package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart_images_count_and_src_by_using_for_loop 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//links in flipkart
		//links consist of address of all matching elements
		List<WebElement> image = driver.findElements(By.xpath("//img"));
		//count number of links
		int count=image.size();
		System.out.println(count);	
		//flipkart links text
		for(int i=0;i<=count-1;i++)
		{
			WebElement we=image.get(i);
			String image_src=we.getAttribute("src");
			System.out.println(image_src);
		}
	}
}
