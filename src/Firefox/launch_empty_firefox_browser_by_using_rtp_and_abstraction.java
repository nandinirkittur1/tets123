package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_empty_firefox_browser_by_using_rtp_and_abstraction 
{
	public static void main(String[] args) throws InterruptedException
	{
		//specific type of the browser
		String key="webdriver.gecko.driver";
		
		//path of the drivers .exe file
		String value="./softwares/geckodriver.exe";
		
		//to Specify the path of the drivers to server
		System.setProperty(key, value);
		
		//Launch empty firefox browser
		WebDriver driver=new FirefoxDriver();		
	
	}
}
