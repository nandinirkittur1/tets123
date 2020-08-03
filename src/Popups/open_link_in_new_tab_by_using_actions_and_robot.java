package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class open_link_in_new_tab_by_using_actions_and_robot 
{
	public static void main(String [] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//right click on Forgotten account link
		act.contextClick(ele).perform();
		
		Thread.sleep(3000);
		Robot r=new Robot();//alt+s
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);//to release T key
		//open link in new window
		/*r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		//open link in new private window
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);*/
	}
}

