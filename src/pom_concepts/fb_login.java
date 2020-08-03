package pom_concepts;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fb_login 
{
	@Test
	public void facebook_login() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		fb_Loginpage fb=new fb_Loginpage(driver);
		fb.setEmail("kitturnandini7@gmail.com");
		fb.setPwd("nrk@0987");
		Thread.sleep(3000);
		fb.clickLogin();
		driver.manage().window().maximize();
		Point p=new Point(200, 1000);
		driver.manage().window().maximize();
	}
}
