package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden_division_popup 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//i[.='Cal'])[1]"));
		//display the calender
		ele.click();
		Thread.sleep(3000);
		//selects the date 12
		driver.findElement(By.xpath("(//a[.='12'])[1]")).click();	
	}
}
