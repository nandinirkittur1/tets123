package Firefox;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_empty_firefox_and_close_using_static 
{
	static
	{
		//specific type of the browser
		String key="webdriver.gecko.driver";
				
		//path of the drivers .exe file
		String value="./softwares/geckodriver.exe";
				
		//to Specify the path of the drivers to server
		System.setProperty(key, value);
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		//Launch empty firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(3000);//wait for 3 sec
		driver.quit();//close enter browser
		//driver.close();//close one tab or specific tab
	}
}
