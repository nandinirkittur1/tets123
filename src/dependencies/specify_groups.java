package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class specify_groups 
{
	@Test
	public void compose()
	{
		System.out.println("compose");
		//Assert.fail();//fails the test case
	}
	@Test(groups="regression")
	public void sentitems()
	{
		System.out.println("sentitems");
	}
	@Test(groups="smoke")
	public void trash()
	{
		System.out.println("trash");
	}
}
