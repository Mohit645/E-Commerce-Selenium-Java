package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPage;
import resources.Base;

public class HomePage_Test extends Base{

	//things to do
	//Adding logs to describe results
	//Generating html reports
	//Screenshots on failure
	//Jenkins integration
	
	public WebDriver driver;
	@BeforeTest
	public void setUp() throws IOException
	{
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String uN, String pW) throws IOException
	{
		driver.get(getBaseUrl());
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.getEmail().sendKeys(uN);
		lp1.getPassword().sendKeys(pW);
//		System.out.println(text);
		lp1.getLogin().click();
		// compare the text with actual value
	// fc = lp.getTitle().getText();
	//	Assert.assertEquals(fc, "Featured Courses");
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[2][2];
		// O row
		data[0][0] = "mohi@gmal.com";
		data[0][1] = "2135";
	//	data[0][2] = "Restricted User";
		
		data[1][0] = "mohit@gmal.com";
		data[1][1] = "2135w";

		
		return data;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
