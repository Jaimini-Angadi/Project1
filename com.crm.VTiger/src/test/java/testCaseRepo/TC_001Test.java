package testCaseRepo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001Test extends BaseClass{
	@Test(groups= {"Regression","Sanity"}/*, retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class*/)
	public void LE_001() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		//Assert.fail();
		String fName=eUtil.getDataFromExcelFile("Leads", 1, 1);
		String lName=eUtil.getDataFromExcelFile("Leads", 1, 2);
		String company=eUtil.getDataFromExcelFile("Leads", 1, 3);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreateNewLead(fName, lName, company);
		
		
		
	}
	@Test
	public void m1()
	{
		System.out.println("Hi");
	}

}
