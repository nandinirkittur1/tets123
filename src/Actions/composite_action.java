package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class composite_action 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Downloads']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//opens downloads link in new ta b without using right click
		act.sendKeys(Keys.CONTROL).click(ele).perform();
		//open downloads link in new window
		//act.sendKeys(Keys.SHIFT).click(ele).perform();
	}
}
