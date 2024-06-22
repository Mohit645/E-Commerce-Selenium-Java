package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import resources.Base;

public class ValidateTitle_Test extends Base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void setUp() throws IOException
	{
		driver = initializeDriver();
		driver.get(getBaseUrl());
	}
	
	@Test
	public void validateTitle() throws IOException
	{

		LandingPage lp = new LandingPage(driver);
		String fc = lp.getTitle().getText();
		Assert.assertEquals(fc, "FEATURED COURSES");
		
		
	}
		@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
