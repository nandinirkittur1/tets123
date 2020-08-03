package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class optimised_script_to_launch_chrome_and_firefox_print_title_url_sourcecode 
{
	static void get_title_src_url(WebDriver d)
	{
		//enter the url
				d.get("https://www.google.com");
						
				//Get title
				String title = d.getTitle();		
				System.out.println(title);
						
				//get url
				String url = d.getCurrentUrl();
				System.out.println(url);
						
				//get source code
				String src_code = d.getPageSource();
				System.out.println(src_code);
	}
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		optimised_script_to_launch_chrome_and_firefox_print_title_url_sourcecode.get_title_src_url(driver);		
				
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");		
		WebDriver driver1=new FirefoxDriver();
		optimised_script_to_launch_chrome_and_firefox_print_title_url_sourcecode.get_title_src_url(driver1);
				
		
	}
}
