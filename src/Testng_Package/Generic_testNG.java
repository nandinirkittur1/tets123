package Testng_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_testNG 
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=m4bcbg5qu7uu");
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
		
	}
}
