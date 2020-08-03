package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_action 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[.='Electronics']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		//this sleep is compulsory bcz it will be searching for an element
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@title='Honor' and .='Honor']")).click();
	}
}
