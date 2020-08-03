package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/dropdown.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='Adigas']"));
		
		//object creation
		Select s=new Select(ele);
		//select the drop down by index
		s.selectByIndex(1);
		//select the drop down by value
		s.selectByValue("i");
		//select the drop down by visible text
		s.selectByVisibleText("mangojuice");
		
		boolean b=s.isMultiple();
		System.out.println(b);
		if(b)
		{
			//de-selection
			/*s.deselectByIndex(1);
			s.deselectByValue("i");
			s.deselectByVisibleText("mangojuice");*/
			s.deselectAll();
			System.out.println("Multi select drop down");
		}
		else
		{
			System.out.println("single select drop down");
		}
		
	}
}
