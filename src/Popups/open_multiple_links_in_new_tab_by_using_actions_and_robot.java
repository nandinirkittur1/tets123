package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class open_multiple_links_in_new_tab_by_using_actions_and_robot 
{
	public static void main(String [] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/multiple_links.html");
		WebElement ele1= driver.findElement(By.id("a1"));
		WebElement ele2= driver.findElement(By.id("a2"));
		WebElement ele3= driver.findElement(By.id("a3"));
		WebElement ele4= driver.findElement(By.id("a4"));
		WebElement ele5= driver.findElement(By.id("a5"));
		//or findelements
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		l.add(ele5);
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Robot r=new Robot();//alt+s
		
		for(WebElement we:l)
		{
			act.contextClick(we).perform();		
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(3000);
		}
	}
}
