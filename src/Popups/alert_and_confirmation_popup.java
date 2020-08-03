package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_and_confirmation_popup 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='Click here for output>>']"));
		ele.click();
		
		//switch from page to popup
		Alert a=driver.switchTo().alert();
		//get the msg/text
		String text=a.getText();
		System.out.println(text);
		Thread.sleep(3000);
		//click on ok button
		a.accept();		
		// or 
		//a.dismiss();
		
	}
}
