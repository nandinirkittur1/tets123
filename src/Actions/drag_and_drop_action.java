package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop_action 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement b2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//drag b1 and b2
		act.dragAndDrop(b1, b2).perform();
		
	}
}
