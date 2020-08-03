package actiTIME;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterTimeTrack 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//Enter data into username text field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//Enter data into password text field
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//Click on Login button
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		//click on + New button
		driver.findElement(By.xpath("//span[.='New']")).click();
        //Enter all the Valid details in Add User 'Account Settings' text fields in User List Page.
		//enter data into First name text field
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("test actitime");
		//enter data into Middle name text field
		driver.findElement(By.xpath("//span[.='Create Tasks']")).click();
		//enter data into Last name text field
		/*driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kittur");
		//enter data into Email text field
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nandinirkittur@gmail.com");
		//enter data into username name text field
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nandini");
		//enter data into password text field
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nandini@123");
		//enter data into Retypr password text field
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("nandini@123");
		//click on create user button
		driver.findElement(By.xpath("//span[.='Create User']")).click();
		//click on Logout button
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		//close the browser
		driver.quit();	*/	
	}
}
