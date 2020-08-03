package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart_images_count_and_imgages_src_using_for_each 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//links in flipkart
		//links consist of address of all matching elements
		List<WebElement> images = driver.findElements(By.tagName("img"));
		//count number of links
		int count=images.size();
		System.out.println(count);	
		//flipkart links text
		for(WebElement we :images)
		{
			String img_src=we.getAttribute("src");
			System.out.println(img_src);
		}
	}
}
