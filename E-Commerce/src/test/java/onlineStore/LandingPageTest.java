package onlineStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import onlineStorePages.LandingPage;
import utilities.WebDriverUtils;

public class LandingPageTest extends WebDriverUtils{
	
	public WebDriver driver;
	LandingPage lp;
	
	
	@BeforeTest
	public void setUp() throws IOException
	{
		driver = getWebdriver();
		lp = new LandingPage(driver);
	}
	
	@Test
	public void validateTitle() throws IOException
	{
		Assert.assertEquals(lp.returnTitle(), printExcelData(0, "LandingPage", driver));
	}
	
	@AfterTest
	public void tearDown()
	{
		 driver.close();
	}
	

}
