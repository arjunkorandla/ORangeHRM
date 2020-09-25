package TestCases_OrangeHrm;




import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Logger logger;
	@BeforeClass
	public void setup()
	{
		
		 logger = Logger.getLogger("TestCases_OrangeHrm");
		String url = "https://www.spicejet.com";
		
		logger.info("**************This is Driver Setup*********");
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     
	     logger.info("**************URL is loading************");
	     
	     
	     driver.get(url);
	     logger.info("**************URL is loaded************");
	     
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	     
	}
	
	

}
