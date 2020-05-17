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
	public void setUp() throws IOException{
		driver = getWebdriver();
		cp = new ContactUsPage(driver);
		cp.clickContactUs();
	}
	
	

	@Test(priority = 1)
	public void validateCustomerServiceText() throws IOException
	{
		
		Assert.assertEquals(cp.getActualCustomerServiceText(), printExcelData(0, "ContactPage", driver));
	}
	
	@Test(dependsOnMethods = { "validateCustomerServiceText" })
	public void sendAMessage() throws IOException {
	//	cp.clickContactUs();
		cp.selectHeading();
		cp.provideOrderReference();
		cp.enterEmail();
		cp.typeMessage();
		cp.fileUpload();
		cp.clickSend();

		Assert.assertEquals(cp.getActualSuccessMessage(), printExcelData(1, "ContactPage", driver));
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
