package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Dependencies 
{
	@Test
	public void compose()
	{
		System.out.println("compose");
		Assert.fail();//fails the test case
	}
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		System.out.println("sentitems");
	}
	@Test
	public void trash()
	{
		System.out.println("trash");
	}
}
