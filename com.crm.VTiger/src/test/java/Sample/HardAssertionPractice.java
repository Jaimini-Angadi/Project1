package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	@Test
	public void strictLevelComparisionHardAssertion()
	{
		String expectedName="Spoorti";
		String actualName="Spoorti";
		System.out.println("Hard Assertion strict level starts");
		Assert.assertEquals(actualName, expectedName);
		System.out.println("Hard Assertion strict level Ends");
	}
	
	@Test
	public void containsLevelComparisionHardAssertion()
	{
		String expectedCity="Don";   //it will fail because London does not contains Don .if we give "don" the 
		String actualCity="London";    //script will pass.
		System.out.println("Hard Assertion contains level starts");
		Assert.assertEquals(true, actualCity.contains(expectedCity));
		Assert.assertTrue(actualCity.contains(expectedCity));
		System.out.println("Hard Assertion contains level ends");
	}

}
