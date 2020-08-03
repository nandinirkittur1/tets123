package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_empty_chrome_browser_by_using_rtp_and_abstraction 
{
	public static void main(String[] args)
	{
		//specific type of the browser
		String key="webdriver.chrome.driver";
		
		//path of the drivers .exe file
		String value="./softwares/chromedriver.exe";
		
		//to Specify the path of the drivers to server
		System.setProperty(key, value);
		
		//Launch empty firefox browser
		WebDriver driver=new ChromeDriver();
	}
}
