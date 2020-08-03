package Drop_Down;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class script_to_print_text_of_all_options_in_ascending_order_by_using_for_each_treeset 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		//wait for 3s
		Thread.sleep(3000);
		//object creation
		Select s=new Select(ele);	
		//get address of all options
		List<WebElement> options = s.getOptions();
		int count=options.size();
		System.out.println(count);
		//Array Declaration and it sorts data in ascending order(top to bottom)
		TreeSet<String> l=new TreeSet<String>();
		//select all the options
		for (WebElement we : options)
		{
			//get text of options
			String text=we.getText();
			//add text to arraylist
			l.add(text);
		}
		//display in single line		
		System.out.println(l);
		//display line by line
		for(String t:l)
		{
			System.out.println(t);
		}			
	}
}
