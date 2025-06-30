package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	
	@Test(groups="Sanity")
	public void LE_003() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lName=eUtil.getDataFromExcelFile("Leads", 7, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 7, 2);
		String leadSource=eUtil.getDataFromExcelFile("Leads", 7, 3);
		String email=eUtil.getDataFromExcelFile("Leads", 7, 4);
		String country=eUtil.getDataFromExcelFile("Leads", 7, 5);
		String city=eUtil.getDataFromExcelFile("Leads", 7, 6);
		String state=eUtil.getDataFromExcelFile("Leads", 7, 7);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.CreateNewLead(lName, company,leadSource , email,country, city, state);
		
	}

}
