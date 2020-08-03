package find_elements_for_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class select_even_radiobutton_and_count_by_using_for_loop 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/radio_buttons.html");
		//links consist of address of all matching elements
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		//count number of links
		int count=radio.size();
		System.out.println(count);	
		//selects even radio buttons
		for(int i=1;i<=count-1;i=i+2)
		{
			radio.get(i).click();
		}		
	}
}
