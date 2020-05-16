package onlineStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ContactUsPage {
	
	public WebDriver driver;
	
	String expectedSuccessMessage = "Your message has been successfully sent to our team.";

	public ContactUsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By contactUS = By.xpath("//a[@title='Contact Us']");

	By subjectHeading = By.xpath("//div[@id='uniform-id_contact']/select");

	By email = By.xpath("//input[@id='email']");

	By orderReference = By.xpath("//input[@id='id_order']");

	By sendButton = By.xpath("//button[@id='submitMessage']");

	By message = By.xpath("//textarea[@id='message']");

	By successMessage = By.cssSelector("p[class*='alert']");
	
	public void selectHeading()
	{
		Select sh = new Select(driver.findElement(subjectHeading));
		sh.selectByIndex(1);
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("xyz@gmail.com");
	}
	
	public void provideOrderReference()
	{
		driver.findElement(orderReference).sendKeys("1234");
	}
	
	public void typeMessage()
	{
		driver.findElement(message).sendKeys("1234");
	}
	
	public void clickSend()
	{
		driver.findElement(sendButton).click();
	}
	public String getActualSuccessMessage()
	{
		return driver.findElement(successMessage).getText();
	}
	
	public String getExpectedSuccessMessage()
	{
		return expectedSuccessMessage;
	}
	
	public void clickContactUs()
	{
		driver.findElement(contactUS).click();
	}
	

	
	
}
