package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class file_download_popup 
{
	public static void main(String [] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[5]/a[1]"));
		//click on I am Professional button
		ele.click();		
		Thread.sleep(3000);
		Robot r=new Robot();//alt+s
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		//release
		r.keyRelease(KeyEvent.VK_ALT);//to release alt key
		r.keyRelease(KeyEvent.VK_S);//to release s key
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);//to click on ok button
		r.keyRelease(KeyEvent.VK_ENTER);//to release enter key
	}
}
