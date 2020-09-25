package TestCases_OrangeHrm;

import org.testng.annotations.Test;

import PageObjects.loginPage;

public class Tc001_Login extends  BaseClass{
	
	@Test
	public void  login()
	{
		loginPage lp = new loginPage(driver);
		logger.info("entering*****USERNAME************");
		lp.getUserName("Admin");
		
		logger.info("entering*****PASSWORD************");
		lp.getPassword("admin123");
		logger.info("CLICING*****LOGIN************");
		lp.getButton();
	}

}
