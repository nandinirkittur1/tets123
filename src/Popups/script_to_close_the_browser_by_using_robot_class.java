package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_to_close_the_browser_by_using_robot_class 
{
	public static void main(String [] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		Robot r=new Robot();//alt+space+n
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);		
	}
}
