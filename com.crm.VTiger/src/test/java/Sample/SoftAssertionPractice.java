package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	@Test
	public void strictLevelComparisionSoftAssertion()
	{
		String expectedValue="Apple";
		String actualValue="apple";
		System.out.println("soft assertion strict level starts");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		s.assertEquals(true, actualValue.equals(expectedValue));
		System.out.println("soft assertion strict level ends");
		s.assertAll();
	}
	
	@Test
	public void containsLevelComparisionSoftAssertion()
	{
		String expectedValue="mini";
		String actualValue="Jaimini";
		System.out.println("soft assertion contains level starts");
		SoftAssert s=new SoftAssert();
		s.assertTrue(actualValue.contains(expectedValue));
		System.out.println("soft assertion contains level ends");
		s.assertAll();
		
	}

}
