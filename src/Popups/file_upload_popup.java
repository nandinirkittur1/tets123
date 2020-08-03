package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class file_upload_popup 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//button[.='I am a Professional']"));
		//click on I am Professional button
		ele.click();
		
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.xpath("//input[@name='uploadCV']"));
		upload.sendKeys("C:\\Users\\Admin\\Desktop\\resume 1.pdf");
	}
}
