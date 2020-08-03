package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_to_print_title_url_sourcecode 
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
		
	}
}
