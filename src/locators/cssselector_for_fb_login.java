package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector_for_fb_login 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("https://www.facebook.com");
		//ele contains the address of the element of tagname "a"
		
		driver.findElement(By.id("u_0_m")).sendKeys("Nandini"); //Enter data into UN text field
		driver.findElement(By.name("surname")).sendKeys("K"); //Enter data into PWD text field
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("2314569545"); //Enter data into Mobile number text field
		driver.findElement(By.className("reg_passwd__")).sendKeys("123@1"); //Enter data into PWD text field
		driver.findElement(By.id("day")).click(); //Enter data into birth date day drop down
		Thread.sleep(3000);//wait for 3sec
		
		
		driver.findElement(By.cssSelector("a[id='a4']")).click(); //click on link
			
	}
}
