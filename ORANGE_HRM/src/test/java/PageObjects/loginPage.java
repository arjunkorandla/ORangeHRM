
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@name='txtUsername']")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@name='txtPassword']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@name='Submit']")
	WebElement buttonclick;
	
	public void getUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}

	public void getPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void getButton()
	{
		buttonclick.click();
	}
}
