package onlineStorePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LandingPage {
	
	public WebDriver driver;	
	
	public LandingPage(WebDriver driver) throws IOException {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public String returnTitle()
	{
		return driver.getTitle(); 
	}
	

	


}
