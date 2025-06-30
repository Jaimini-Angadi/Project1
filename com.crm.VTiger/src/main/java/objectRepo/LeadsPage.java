package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewLeadIcon() {
		return createNewLeadIcon;
	}
	
	/** 
	 * This is a business library used to click on create New Lead Icon
	 */
	
	public void clickOnCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}

}
