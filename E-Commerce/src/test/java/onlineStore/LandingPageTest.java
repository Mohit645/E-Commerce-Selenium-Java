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
	public void validateTitle()
	{
		Assert.assertEquals(lp.returnTitle(), "My Store");
	}
	
	@AfterTest
	public void tearDown()
	{
		// driver.close();
	}
	

}
