package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
public class TC_007  extends BaseClass{

	
		
		@Test(groups= {"Smoke","Regression"})
		public void LE_002() throws IOException {
			HomePage hp=new HomePage(driver);
			hp.clickOnLeadsMenu();
			LeadsPage lp=new LeadsPage(driver);
			lp.clickOnCreateNewLeadIcon();
			String lName=eUtil.getDataFromExcelFile("Leads", 4, 1);
			String company=eUtil.getDataFromExcelFile("Leads", 4, 2);
			String title=eUtil.getDataFromExcelFile("Leads", 4, 3);
			String noOfEmployees=eUtil.getDataFromExcelFile("Leads", 4, 4);
			String mobile=eUtil.getDataFromExcelFile("Leads", 4, 5);
			CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
			cnlp.CreateNewLead(lName,company, title, noOfEmployees, mobile);
			
		}

	}



