package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_action 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//right click on Forgotten account link
		act.contextClick(ele).perform();		
	}
}
