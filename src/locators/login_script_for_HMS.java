package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_script_for_HMS 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("http://122.166.192.191:9007/");
		//Inspect Email/phone and enter value
		driver.findElement(By.id("email")).sendKeys("nandinikitturqsp@gmail.com");
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect password and enter value
		driver.findElement(By.name("password")).sendKeys("nandinirkittur");			
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect login button and click
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//wait for 3sec
		Thread.sleep(3000);
		//To verify the home page after login
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(url.equals("http://122.166.192.191:9007/index.php?doctor"))
		{
			System.out.println("Home page is displayed:pass");
		}
		else
		{
			System.out.println("Home page is not displayed:Fail");
		}
		
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect Logout button and click
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		
		//To verify the Login  page after logout
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(url1.equals("http://122.166.192.191:9007/index.php?login/logout"))
		{
			System.out.println("Login page is displayed:pass");
		}
		else
		{
			System.out.println("Login page is not displayed:Fail");
		}		
	}
}
