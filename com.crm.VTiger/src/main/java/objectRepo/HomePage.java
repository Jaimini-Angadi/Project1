package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	//Locating the WebElements
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutOperation;

	
	//Initializing the WebElemnt
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//generate getters
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

    
	public WebElement getContactsMenu() {
		return contactsMenu;
	}


	public WebElement getAccountsIcon() {
		return accountsIcon;
	}


	public WebElement getSignOutOperation() {
		return signOutOperation;
	}
	
	//Creating Business Libraries
	/**
	 * This is a business library to click on Leads menu
	 */
	
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on contacts menu
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	/** 
	 * This is a business library to perform sign out opeartion from the application
	 * @param driver
	 */
	
	public void signOutOperation(WebDriver driver)
	{
		SeleniumUtility sUtil=new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getAccountsIcon());
		getSignOutOperation().click();
	}
}
