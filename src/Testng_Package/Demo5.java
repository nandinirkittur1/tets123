package Testng_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 
{
	@Test (enabled=false)
	public void test1()
	{
		Reporter.log("test1 is pass",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("test2 is pass",true);
	}
}
