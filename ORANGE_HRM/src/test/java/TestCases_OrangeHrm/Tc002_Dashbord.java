package TestCases_OrangeHrm;

import org.testng.annotations.Test;

import PageObjects.Dashboard;
import PageObjects.loginPage;

public class Tc002_Dashbord extends BaseClass {
	
	
	@Test(priority = 0)
	public void dashbord() throws InterruptedException
	{
		loginPage lp = new loginPage(driver);
		logger.info("entering*****USERNAME************");
		lp.getUserName("Admin");
		
		logger.info("entering*****PASSWORD************");
		lp.getPassword("admin123");
		logger.info("CLICING*****LOGIN************");
		lp.getButton();
		
	
		
		
		Dashboard obj = new Dashboard(driver);
		Thread.sleep(3000);
		obj.getclickAssignleave();
		obj.getSelectLeaveType(2);
		obj.getSelectFromDate("2020", "09", "17");
		obj.getSelectToDate("2020", "12", "12");
		obj.getSelectPartialDays(3);
		obj.gettxtComent("fjjivvbencioeofrererferfefergererf");
		obj.getbuttonAsign();
				
	}

}
