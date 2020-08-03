package Drop_Down;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class script_to_add_specified_option_in_arraylist 
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
		/*int count=options.size();
		System.out.println(count);*/
		//Array Declaration
		ArrayList<String> l=new ArrayList<String>();
		//select all the options
		for (WebElement we : options)
		{
			//get text of options
			String text=we.getText();
			//add text to arraylist
			l.add(text);
		}
		//sort and display in single line
		//Collections.sort(l);
		//System.out.println(l);
		//to get the text line by line before removal of text
		System.out.println("Before adding text:");
		for(String t:l)
		{
			System.out.println(t);
		}
		//to verify the given text is present or not
		l.add("Corona");
		System.out.println("After adding text:");
		//to get the text line by line after removal of text
		for(String t:l)
		{
			System.out.println(t);
		}
	}
}
