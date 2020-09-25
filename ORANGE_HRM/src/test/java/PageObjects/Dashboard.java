package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
	
	public WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
	}
	
	@FindBy (xpath ="//span[contains(text(), 'Assign Leave')]")
	WebElement clickAssignleave;
	
	@FindBy(xpath = "//select[@name= 'assignleave[txtLeaveType]']")
	WebElement SelectLeaveType;
	
	@FindBy(xpath = "//input[@id= 'assignleave_txtFromDate']")
	WebElement SelectFomDate;
	
	@FindBy(xpath = "//input[@id= 'assignleave_txtToDate']")
	WebElement SelectToDate;
	
	@FindBy(xpath = "//select[@id= 'assignleave_partialDays']")
	WebElement SelectPartialDays;
	
	@FindBy(xpath = "//textarea[@name= 'assignleave[txtComment]']")
	WebElement txtComent;
	
	@FindBy(xpath = "//input[@id= 'assignBtn']")
	WebElement buttonAsign;
	
	
	public void getclickAssignleave()
    {
		clickAssignleave.click();
    }
	
	public void getSelectLeaveType(int opt)
    {
		
		Select obj = new Select(SelectLeaveType);
		obj.selectByIndex(opt);
		 
    }
	
	public void getSelectFromDate(String Y, String M, String D)
    {
		SelectFomDate.sendKeys(Y+ "-"+ M+"-"+ D);
    }
	
	public void getSelectToDate(String Y, String M, String D)
    {
		SelectToDate.sendKeys(Y+ "-"+ M+"-"+ D);
    }
	
	public void getSelectPartialDays(int partial)
    {
		Select drpdwn = new Select(SelectPartialDays);
		drpdwn.selectByIndex(partial);
		SelectPartialDays.sendKeys();
    }
	
	
	public void gettxtComent(String comment)
    {
		txtComent.sendKeys(comment);
    }
	
	public void getbuttonAsign()
    {
		buttonAsign.click();
    }

	
	

	
}
