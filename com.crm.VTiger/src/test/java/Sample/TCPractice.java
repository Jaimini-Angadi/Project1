package Sample;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TCPractice extends BaseClass{
	public void LE_001() {
		HomePage hp= new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lop=new LeadsPage(driver);
		lop.clickOnCreateNewLeadIcon();
		//CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		//String fName=eUtil.getDataFromExcelFile("Leads", 1, 1);
		//String lName=eUtil.getDataFromExcelFile("Leads", 1, 2);
		//String company=eUtil.getDataFromExcelFile("Leads", 1, 3);
		//cnlp.createNewLead(fName,lName,company);
		System.out.println("Text method executed");
		
	}

}
