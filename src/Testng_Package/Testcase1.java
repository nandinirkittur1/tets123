package Testng_Package;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase1 extends Generic_testNG
{
	@Test
	public void test1() throws InterruptedException 
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div['Login ']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		//static title
		//Assert.assertEquals(title, "actiTIME - Login");//pass
		//Assert.assertEquals(title, "actiTIME - Login123");//fails
		//dyanamic title
		Assert.assertTrue(title.contains("actiTIME"));//pass
		System.out.println("1");
	}
}
