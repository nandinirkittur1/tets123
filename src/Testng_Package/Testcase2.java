package Testng_Package;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 extends Generic_testNG
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
		
		SoftAssert sa=new SoftAssert();
		//dyanamic title
		sa.assertTrue(title.contains("actiTIME123"));//pass
		System.out.println("1");
		sa.assertAll();//compulsory in case of softassert ad it will give the actual result
	}
}
