package Testng_Package;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		Reporter.log("test1 is pass",true);
	}
}
