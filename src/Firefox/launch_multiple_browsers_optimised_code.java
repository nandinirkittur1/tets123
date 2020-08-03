package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class launch_multiple_browsers_optimised_code 
{
	static void get_title_src_url(WebDriver d,String url)
	{
		//enter the url
		d.get(url);						
		//Get title
		String title = d.getTitle();		
		System.out.println(title);						
		//get url
		String url1 = d.getCurrentUrl();
		System.out.println(url1);						
		//get source code
		String src_code = d.getPageSource();
		System.out.println(src_code);
	}
	
	public static void main(String[] args)
	{
		//Chrome
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		launch_multiple_browsers_optimised_code.get_title_src_url(driver,"https://www.google.com");		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");		
		WebDriver driver1=new FirefoxDriver();
		launch_multiple_browsers_optimised_code.get_title_src_url(driver1,"https://www.facebook.com");		
	}
}
