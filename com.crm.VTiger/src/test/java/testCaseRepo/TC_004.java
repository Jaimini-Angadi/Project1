package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass{
	
	@Test(groups= {"Smoke"})
	public void CON_001() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String fName=eUtil.getDataFromExcelFile("Contacts", 1, 1);
		String lName=eUtil.getDataFromExcelFile("Contacts", 1, 2);
		String title=eUtil.getDataFromExcelFile("Contacts", 1, 3);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.createNewContact(fName, lName, title);
	}

}
