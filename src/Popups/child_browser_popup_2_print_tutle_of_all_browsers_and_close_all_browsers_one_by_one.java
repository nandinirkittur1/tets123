package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_browser_popup_2_print_tutle_of_all_browsers_and_close_all_browsers_one_by_one 
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
		for(String ids :allids)
		{
			driver.switchTo().window(ids);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			driver.close();
		}
	}
}
