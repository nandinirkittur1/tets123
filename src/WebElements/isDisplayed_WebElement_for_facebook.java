package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class isDisplayed_WebElement_for_facebook 
{
	public static void main(String [] args) throws InterruptedException
	{
		//Set driver path
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//Launch empty firefox driver
		WebDriver driver=new FirefoxDriver();
		//Enter the url
		driver.get("https://www.facebook.com");
		//Inspect Email/phone and enter value
		WebElement ele=driver.findElement(By.xpath("//input[@name='email' and @id='email']"));
		//check whether the element is displayed or not
		boolean b=ele.isDisplayed();
		System.out.println(b);
		if(b)
		{
			System.out.println("tbox is displayed");
		}
		else
		{
			System.out.println("tbox is not displayed");
		}
		//wait for 3sec
		Thread.sleep(3000);
		//enters the data
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("xyz");
		//Selects the entire data
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(Keys.CONTROL+"a");
		//wait for 3sec
		Thread.sleep(3000);
		//clears the entire data
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(Keys.DELETE);	
		//wait for 3sec
		Thread.sleep(3000);
		//perform click action
		driver.findElement(By.xpath("//a[.='Forgotten account?']")).sendKeys(Keys.ENTER);
		//wait for 3sec
		Thread.sleep(3000);
		//enters the data
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("nandini");
		//wait for 3sec
		Thread.sleep(3000);
		//selects all the data
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(Keys.CONTROL+"a");
		//wait for 3sec
		Thread.sleep(3000);
		//Cut all the data from Email text box
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(Keys.CONTROL+"X");
		//wait for 3sec
		Thread.sleep(3000);
		//paste all the data into another text box
		driver.findElement(By.xpath("//input[@name='email' and @placeholder='Phone number']")).sendKeys(Keys.CONTROL+"V");	
		
		
	}
}
