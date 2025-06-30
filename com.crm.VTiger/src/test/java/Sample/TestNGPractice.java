package Sample;

import static org.testng.Assert.fail;

import org.testng.Assert;
//TestNG Annotations and Attributes
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Test
//@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	
	//@Ignore
	@Test(priority=1 /*invocationCount=0 ,enabled=false*/)
	public void createUser() 
	{
		System.out.println("User Created");
	}
	
	@Test(priority=2 ,dependsOnMethods= {"deleteUser"})
	public void modifyUser() 
	{
		System.out.println("User Modified");
	}
	
	@Test(priority= -3)
	public void deleteUser() 
	{
//		Assert.fail();
		System.out.println("User Deleted");
	}

}
