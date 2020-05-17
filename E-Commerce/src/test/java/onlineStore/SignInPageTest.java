package onlineStore;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import onlineStorePages.SignInPage;
import utilities.WebDriverUtils;

public class SignInPageTest extends WebDriverUtils{
	
	public WebDriver driver;
	SignInPage sp;

	@BeforeTest
	public void setUp() throws IOException
	{
		driver = getWebdriver();
		sp = new SignInPage(driver);
		sp.clickSignInTab();
	}
	
	@Test
	public void checkSignInPageLanding()
	{
		Assert.assertEquals(sp.getAuth(), "AUTHENTICATION");
	}

	@Test
	public void validateExistingAccountAlert()
	{
		sp.enterCreateEmail();
		sp.clickCreateAccountButton();
		Assert.assertEquals(sp.getAccountExistsMessage(), "An account using this email address has already been registered. Please enter a valid password or request a new one.");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
