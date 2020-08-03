package Testng_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void test2()
	{
		Reporter.log("test2 is pass",true);
	}
}
