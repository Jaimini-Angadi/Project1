package objectRepo;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class CreatingNewLeadPage {
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstNameTextfield;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastNameTextField;
		
		@FindBy(xpath="//input[@name='company']")
		private WebElement companyTtextfield;
		
		@FindBy(xpath="//input[@id='designation']")
		private WebElement TitleTextField;
		
		@FindBy(xpath="//input[@id='email']")
		 private WebElement EmailTextFiled;
		
		@FindBy(xpath="//input[@id='mobile']")
		private WebElement mobileTextfield;
		
		@FindBy(xpath="//input[@id='country']")
		private WebElement countrytextField;
		
		@FindBy(xpath="//input[@id='city']")
		private WebElement cityTextfield;
		
		@FindBy(xpath="//input[@id='state']")
		private WebElement statetextfield;
		
		@FindBy(xpath="//select[@name='leadsource']")
		private WebElement leadSourceDropdown;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement SavetextField;
		
		@FindBy(xpath="//input[@name='noofemployees']")
		private WebElement noOfEmployeesTextField;

		
		//initializing webelements
		
		public CreatingNewLeadPage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
			}
		
	// generating the gettars
		public WebElement getFirstNameTextfield() {
			return firstNameTextfield;
		}

		public WebElement getLastNameTextField() {
			return lastNameTextField;
		}

		public WebElement getCompanyTtextfield() {
			return companyTtextfield;
		}

		public WebElement getTitleTextField() {
			return TitleTextField;
		}

		public WebElement getEmailTextFiled() {
			return EmailTextFiled;
		}

		public WebElement getMobileTextfield() {
			return mobileTextfield;
		}

		public WebElement getCountrytextField() {
			return countrytextField;
		}

		public WebElement getCityTextfield() {
			return cityTextfield;
		}

		public WebElement getStatetextfield() {
			return statetextfield;
		}

		public WebElement getSavetextField() {
			return SavetextField;
		}

		public WebElement getNoofEmployeesTextField() {
			return noOfEmployeesTextField;
		}
		public WebElement getLeadSourceDropdown() {
			return leadSourceDropdown;
		}

		//creating Business Libraries
		
		public void CreateNewLead(String fname,String lname,String company) {
			
			getFirstNameTextfield().sendKeys(fname);
			getLastNameTextField().sendKeys(lname);
			getCompanyTtextfield().sendKeys(company);
			getSavetextField().click();
			}
		
		
//public void CreateNewLead(String lname,String company,String title,String noOfEmployees,String mobile) {
//			
//			//getFirstNameTextfield().sendKeys(fname);
//			getLastNameTextField().sendKeys(lname);
//			getCompanyTtextfield().sendKeys(company);
//			getSavetextField().click();
//			}
		
		public void CreateNewLead(String lname,String company,String title,String noOfEmployees,String mobile) {
			getLastNameTextField().sendKeys(lname);
			getCompanyTtextfield().sendKeys(company);
			getTitleTextField().sendKeys(title);
			getNoofEmployeesTextField().sendKeys(noOfEmployees);
			getMobileTextfield().sendKeys(mobile);
			getSavetextField().click();
			}
		
		
		public void CreateNewLead(String lname,String company,String leadSource,String email,String Country,String city,String State)
		{
			getLastNameTextField().sendKeys(lname);
			getCompanyTtextfield().sendKeys(company);
			getEmailTextFiled().sendKeys(email);
			//getMobileTextfield().sendKeys(mobile);
			Select sel=new Select(getLeadSourceDropdown());
			sel.selectByValue(leadSource);
			getCityTextfield().sendKeys(city);
			getCountrytextField().sendKeys(Country);
			getStatetextfield().sendKeys(State);
			getSavetextField().click();
			
			}
	}



