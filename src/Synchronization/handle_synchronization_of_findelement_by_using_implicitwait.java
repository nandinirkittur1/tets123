package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_synchronization_of_findelement_by_using_implicitwait 
{
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//implicitly synchroniation
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		//switch to tasks page
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='USERS']")).click();
	}
}
