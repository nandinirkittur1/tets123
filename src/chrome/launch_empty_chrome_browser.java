package chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_empty_chrome_browser 
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
		ChromeDriver driver=new ChromeDriver();
	}
}
