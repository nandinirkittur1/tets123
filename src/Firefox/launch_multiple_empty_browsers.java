package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_multiple_empty_browsers 
{
	public static void main(String[] args)
	{
		//specific type of the browser
		String key="webdriver.gecko.driver";
		
		//path of the drivers .exe file
		String value="./softwares/geckodriver.exe";
		
		//to Specify the path of the drivers to server
		System.setProperty(key, value);
		
		//Launch empty firefox browser
		WebDriver driver=new FirefoxDriver();
		
		/* for chrome empty browser */
		//specific type of the browser
		String key1="webdriver.chrome.driver";
				
		//path of the drivers .exe file
		String value1="./softwares/chromedriver.exe";
				
		//to Specify the path of the drivers to server
		System.setProperty(key1, value1);
				
		//Launch empty chrome browser
			WebDriver driver1=new ChromeDriver();			
		
	}
}
