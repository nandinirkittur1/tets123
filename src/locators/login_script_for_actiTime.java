package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_script_for_actiTime 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("http://localhost/login.do");
		//Inspect Email/phone and enter value
		driver.findElement(By.id("username")).sendKeys("admin");
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect password and enter value
		driver.findElement(By.name("pwd")).sendKeys("manager");			
		//wait for 3sec
		Thread.sleep(3000);
		//Inspect login button and click
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//wait for 3sec
		Thread.sleep(3000);
		//To verify the home page after login
		String title=driver.getTitle();
		System.out.println(title);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(title.contains("actiTIME"))
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
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
		//To verify the Login  page after logout
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		//if the title is partially dynamic elements then use contains() else we can go for equals()
		if(url1.equals("http://localhost/login.do"))
		{
			System.out.println("Login page is displayed:pass");
		}
		else
		{
			System.out.println("Login page is not displayed:Fail");
		}		
	}	
}
