package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//locating the WebElement 
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateNewContactsIcon;
	
	//Initializing the webElemets
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//generate getters
	public WebElement getClickOnContactsIcon() {
		return CreateNewContactsIcon;
	}
	
	//creating business library(user defined method)
	
	public  void clickOnCreateNewContactsIcon() {
		getClickOnContactsIcon().click();
		
	}

	
	
	

}
