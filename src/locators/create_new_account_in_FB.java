package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class create_new_account_in_FB 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/xpath_src_code.html");
		Thread.sleep(3000);
		//ele contains the address of the element of tagname "a"
		driver.findElement(By.xpath("//div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[1]/input[2]")).clear();
		driver.findElement(By.xpath("//div[2]/input[1]")).clear();
		driver.findElement(By.xpath("//div[2]/input[2]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("A");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("B");
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("C");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("D");	
				
	}
}
