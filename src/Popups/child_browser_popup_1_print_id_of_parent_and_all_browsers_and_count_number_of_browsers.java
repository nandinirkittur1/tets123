package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_browser_popup_1_print_id_of_parent_and_all_browsers_and_count_number_of_browsers 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		//get parent id
		String parent_id=driver.getWindowHandle();
		System.out.println(parent_id);
		Thread.sleep(3000);
		//get all browser ids
		Set<String> allids = driver.getWindowHandles();
		//count of all browsers
		int count=allids.size();
		System.out.println("The number of browsers :"+count);
		
		System.out.println("All ids: ");
		//print all browser ids
		for(String ids:allids)
		{
			System.out.println(ids);
		}
	}
	
}
