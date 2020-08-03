package pom_concepts;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class actitime_login 
{
	@Test
	public void login_actitime() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		actitime_LoginPage lp=new actitime_LoginPage(driver);
		String title=driver.getTitle();
		System.out.println(title);
		WebDriverWait wait=new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.titleContains(title));
		//Thread.sleep(3000);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		//minimize the browser
		driver.manage().window().maximize();
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(300, 500);
		driver.manage().window().setSize(d);
	}
}
