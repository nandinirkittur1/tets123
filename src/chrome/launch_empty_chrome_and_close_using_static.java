package chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_empty_chrome_and_close_using_static 
{
	
	static
	{
		//specific type of the browser
		String key="webdriver.chrome.driver";
						
		//path of the drivers .exe file
		String value="./softwares/chromedriver.exe";
						
		//to Specify the path of the drivers to server
		System.setProperty(key, value);			
				
				
	}
	public static void main(String[] args) throws InterruptedException
	{
		
		//Launch empty firefox browser
		ChromeDriver driver=new ChromeDriver();
	
		Thread.sleep(3000);//wait for 3 sec		
		
		driver.quit();//close enter browser
		//driver.close();//close one tab or specific tab
	}
}
