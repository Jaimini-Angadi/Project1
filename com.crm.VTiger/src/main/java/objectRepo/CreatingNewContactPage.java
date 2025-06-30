package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	/** 
	 * This is creating new Contact page POM class
	 * @author Jaimini
	 * @version 25-06-05
	 */
	
	//Locating the WebElemets
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement TitleTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement MobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingCityTextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//Initializing the webElements
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//generate getters
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return TitleTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return MobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//creating business libraries(utilizing the webelemts
	
	/** 
	 * This is a business library to craete a new contact
	 * @param fName
	 * @param lName
	 * @param title
	 */
	public void createNewContact(String fName,String lName,String title)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
	}
	/** 
	 * This is a business library to create new contact
	 * @param lName
	 * @param title
	 * @param email
	 * @param mobile
	 */
	public void createNewContactPage(String lName, String title,String email,String mobile)
	{
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/** 
	 * This is a business library to create new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContactPage(String lName,String email,String mobile, String mailingCity,
			String mailingState, String mailingCountry)
	{
		getLastNameTextField().sendKeys(lName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
	

}
