package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_action 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/double_click_action.html");
		
		WebElement ele = driver.findElement(By.xpath("//div"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//double click on block
		act.doubleClick(ele).perform();
		
	}
}
