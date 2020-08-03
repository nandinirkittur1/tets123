package Drop_Down;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class script_to_print_text_of_all_options_in_descending_order_by_using_for_loop_array_list 
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
		//Array Declaration
		ArrayList<String> l=new ArrayList<String>();
		//select all the options
		for (int i=count-1;i>=0;i--)
		{
			//get text of options
			String text=options.get(i).getText();
			//add text to arraylist
			l.add(text);
		}
		
		
		
		//sort and display in single line
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		System.out.println("Sorted in Descending order:");
		for(int i=0;i<=count-1;i++)
		{
			String t=l.get(i);
			System.out.println(t);
		}			
	}
}
