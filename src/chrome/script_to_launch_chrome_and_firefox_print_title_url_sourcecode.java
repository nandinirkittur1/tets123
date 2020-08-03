package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_to_launch_chrome_and_firefox_print_title_url_sourcecode 
{
	public static void main(String[] args)
	{
		//Chrome 
		//specific type of the browser
		String key="webdriver.chrome.driver";
			
		//path of the drivers .exe file
		String value="./softwares/chromedriver.exe";
			
		//to Specify the path of the drivers to server
		System.setProperty(key, value);
				
		//Launch empty firefox browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.google.com");
		
		//Get title
		String title = driver.getTitle();		
		System.out.println(title);
		
		//get url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//get source code
		String src_code = driver.getPageSource();
		System.out.println(src_code);
		
		System.out.println("==========================");
		//Chrome 
		//specific type of the browser
		String key1="webdriver.gecko.driver";
					
		//path of the drivers .exe file
		String value1="./softwares/geckodriver.exe";
					
		//to Specify the path of the drivers to server
		System.setProperty(key1, value1);
						
		//Launch empty firefox browser
		WebDriver driver1=new FirefoxDriver();
				
		//enter the url
		driver.get("https://www.google.com");
				
		//Get title
		String title1 = driver.getTitle();		
		System.out.println(title1);
				
		//get url
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
				
		//get source code
		String src_code1 = driver.getPageSource();
		System.out.println(src_code1);
	}
}
