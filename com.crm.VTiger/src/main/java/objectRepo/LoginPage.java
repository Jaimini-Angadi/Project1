package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Locating the WebElements
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;

	//Initializing the WebElemnts
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Generate getters
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Creating business libraries
	
	/** 
	 * This is a business library to perform login operation to VTiger application
	 * @param username
	 * @param password
	 */
	public void LoginToApplication(String username,String password)
	{
		getUsernameTextField().sendKeys(username);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
	
	
	
	
	
	

}
