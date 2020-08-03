package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_multiple_browsers_optimised 
{
	public static void main(String[] args)
	{
		//to Specify the path of the drivers to server
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		//Launch empty firefox browser
		WebDriver driver=new FirefoxDriver();
		
		/* for chrome empty browser */
		//to Specify the path of the drivers to server
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
				
		//Launch empty chrome browser
			WebDriver driver1=new ChromeDriver();
	}
}
