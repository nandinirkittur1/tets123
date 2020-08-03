package pom_concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class flipkart_login 
{
	@Test
	public void fk_login()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		flipkart_loginpage fk=new flipkart_loginpage(driver);
		fk.clicklogin1ink();
		Alert a=driver.switchTo().alert();
		fk.enterEmail("9611852880");
		fk.enterPassword("nrk@1234");
		fk.clickLoginButton();
		//driver.manage().window().maximize();
	}
}
