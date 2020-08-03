package Handling_Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class write_text_of_all_links_data_in_excel_sheet 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++)
		{
			String data=links.get(i).getText();
			System.out.println(data);
			generic_write.writedata(i, data);
		}
	}
}
