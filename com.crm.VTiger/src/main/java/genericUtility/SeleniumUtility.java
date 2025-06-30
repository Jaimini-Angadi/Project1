package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an utility class containing from selenium library
 */
public class SeleniumUtility {
	/**
	 * This is a method to access a web application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver ,String url) 
	{
		driver.get(url);
	}
	
	/** 
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindoew(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method for a implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver,int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}

//////////*********Handling Alert*******///////////
     
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	public String getAlertMessage(WebDriver driver)
	{
		String value=driver.switchTo().alert().getText();
		return value;
	}
	
	
	public void sendValueToAlert(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
//////////////***********88Handling Dropdown**********////////
     
	public void selectOptionByIndex(WebElement dropdownEle,String value)
	{
		Select sel=new Select(dropdownEle);
		sel.selectByVisibleText(value);
	}
	
	public void selectOptionsByVisibleText(WebElement dropdownEle,String visibleText)
	{
		Select sel=new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}
	
	///////////***********Handling Mouse Actions***********////////////////////
	
	
	public void mouseHoveringAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/////////////***********Taking Screenshot of Webpage*******/////////////
	
	public String takesScreenshot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+filename+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();          //used for Listeners
	}
}
