package onlineStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import onlineStorePages.ContactUsPage;
import utilities.WebDriverUtils;

public class ContactUsTest extends WebDriverUtils {

	public WebDriver driver;
	ContactUsPage cp;

	@BeforeTest
	public void setUp() throws IOException {
		driver = getWebdriver();
		cp = new ContactUsPage(driver);
		cp.clickContactUs();
	}

	@Test(priority = 1)
	public void validateCustomerServiceText()
	{
		
		Assert.assertEquals(cp.getActualCustomerServiceText(), cp.getExpectedCustomerServiceText());
	}
	
	@Test(dependsOnMethods = { "validateCustomerServiceText" })
	public void sendAMessage() {
	//	cp.clickContactUs();
		cp.selectHeading();
		cp.provideOrderReference();
		cp.enterEmail();
		cp.typeMessage();
		cp.fileUpload();
		cp.clickSend();

		Assert.assertEquals(cp.getActualSuccessMessage(), cp.getExpectedSuccessMessage());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
