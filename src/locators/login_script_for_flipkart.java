package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_script_for_flipkart 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("https://www.facebook.com");
		//Inspect Email/phone and enter value
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("kitturnandini7@gmail.com");
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect password and enter value
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("nandinirkittur");			
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect login button and click
		driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		//wait for 3sec
		Thread.sleep(3000);
		//To verify the home page after login
		String title=driver.getTitle();
		System.out.println(title);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(title.contains("Facebook"))
		{
			System.out.println("Home page is displayed:pass");
		}
		else
		{
			System.out.println("Home page is not displayed:Fail");
		}
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect Account button and click
		driver.findElement(By.xpath("//div[@aria-label='Account' and @role='button']")).click();
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect Logout button and click
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		
		//To verify the Login  page after logout
		String title1=driver.getTitle();
		System.out.println(title1);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(title1.contains("Facebook – log in or sign up"))
		{
			System.out.println("Login page is displayed:pass");
		}
		else
		{
			System.out.println("Login page is not displayed:Fail");
		}			
	}
}
