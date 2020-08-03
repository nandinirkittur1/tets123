package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart_textbox_and_radiobutton_count 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//links in flipkart
		//links consist of address of all matching elements
		List<WebElement> text_radio = driver.findElements(By.xpath("//input[@type='text'] | //input[@type='radio']"));
		//count number of links
		int count=text_radio.size();
		System.out.println(count);		
	}
}
