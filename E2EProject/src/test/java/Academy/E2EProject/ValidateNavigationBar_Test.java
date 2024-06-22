package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import resources.Base;

public class ValidateNavigationBar_Test extends Base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateNavigationBar_Test.class.getName());
	@BeforeTest
	public void setUp() throws IOException
	{
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(getBaseUrl());
		log.info("URL got hit");
	}
	
	@Test
	public void validateNavigate() throws IOException
	{

		LandingPage lp = new LandingPage(driver);
		WebElement el = lp.getNavigationBar();
		Assert.assertTrue(!el.isDisplayed(), "Got Displayed");
		log.info("Element got displayed");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
