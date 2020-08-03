package Firefox;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_empty_firefox 
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
		FirefoxDriver driver=new FirefoxDriver();
	}
}
