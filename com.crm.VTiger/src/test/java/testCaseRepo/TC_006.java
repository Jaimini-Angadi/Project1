package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass{
	
	@Test(groups= {"Smoke"})
	public void CON_003() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactsIcon();
		String lName=eUtil.getDataFromExcelFile("Contacts", 7, 1);
		String email=eUtil.getDataFromExcelFile("Contacts", 7, 2);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 7, 3);
		String mailingCity=eUtil.getDataFromExcelFile("Contacts", 7, 4);
		String mailingState=eUtil.getDataFromExcelFile("Contacts", 7, 5);
		String mailingCountry=eUtil.getDataFromExcelFile("Contacts", 7, 6);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.createNewContactPage(lName, email, mobile, mailingCity, mailingState, mailingCountry);
	}

}
