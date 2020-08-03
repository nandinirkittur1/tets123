package Drop_Down;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class script_to_verify_whether_specified_text_is_present_in_arraylist_or_not 
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
		Collections.sort(l);
		System.out.println(l);
		//to verify the given text is present or not
		boolean b=l.contains("Jun");
		if(b)
		{
			System.out.println("the given text is present");
		}
		else
		{
			System.out.println("The given text is not present");
		}
		//to get the text line by line
		/*for(String t:l)
		{
			System.out.println(t);
		}*/		
	}
}
