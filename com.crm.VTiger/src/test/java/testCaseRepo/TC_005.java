package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass{
	@Test(groups= {"Regression"})
	public void CON_002() throws IOException {
		
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String lName=eUtil.getDataFromExcelFile("Contacts",4 , 1);
		String title=eUtil.getDataFromExcelFile("Contacts",4 , 2);
		String email=eUtil.getDataFromExcelFile("Contacts",4 , 3);
		String mobile=eUtil.getDataFromExcelFile("Contacts",4 , 4);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.createNewContactPage(lName, title, email, mobile);
	
	}

}
