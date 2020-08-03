package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators_4 

{
	public static void main(String [] args) throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		//Url pf th html file
		driver.get("file:///C:/Users/Admin/Desktop/HTML%20files/sample3.html");
		//ele contains the address of the element of tagname "a"
		
		driver.findElement(By.className("c4")).click(); //CLICK ON RADIO BUTTON
		driver.findElement(By.name("n1")).sendKeys("username");//ENTER UN
		driver.findElement(By.id("a3")).click();// CLICK ON CHECKBOX
		driver.findElement(By.name("n2")).sendKeys("password");//ENTER PWD
		driver.findElement(By.name("n1")).clear();//CLEAR UN
		driver.findElement(By.id("a5")).click();// CLICK ON LOGIN BUTTON
		Thread.sleep(3000);
		driver.findElement(By.name("n2")).clear();//CLEAR PWD
		//Click on facebook element link
		driver.findElement(By.id("a8")).click();		
	}
}
