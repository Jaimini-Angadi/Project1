package Sample;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailFacebook {
	@FindBy(xpath ="//input[@id='email']")
	WebElement email;
	
	public EmailFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		EmailFacebook f=new EmailFacebook(driver);
		//WebElement EmailField=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		f.email.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		f.email.sendKeys("abc@123gmail.com");
	}

}


