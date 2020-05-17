package onlineStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	public WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	By contactUS = By.xpath("//a[@title='Contact Us']");

	By subjectHeading = By.xpath("//div[@id='uniform-id_contact']/select");

	By email = By.xpath("//input[@id='email']");

	By orderReference = By.xpath("//input[@id='id_order']");

	By sendButton = By.xpath("//button[@id='submitMessage']");

	By message = By.xpath("//textarea[@id='message']");

	By fileUploadButton = By.xpath("//input[@id='fileUpload']");

	By successMessage = By.cssSelector("p[class*='alert']");

	By customerService = By.xpath("//div[@id='center_column']/h1");

	public void selectHeading() {
		Select sh = new Select(driver.findElement(subjectHeading));
		sh.selectByIndex(1);
	}

	public void enterEmail() {
		driver.findElement(email).sendKeys("xyz@gmail.com");
	}

	public void provideOrderReference() {
		driver.findElement(orderReference).sendKeys("1234");
	}

	public void typeMessage() {
		driver.findElement(message).sendKeys("1234");
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}

	public String getActualSuccessMessage() {
		return driver.findElement(successMessage).getText();
	}

	public void clickContactUs() {
		driver.findElement(contactUS).click();
	}

	public void fileUpload() {
		driver.findElement(fileUploadButton).sendKeys("C:\\Users\\Mohit\\demo.txt");
	}

	public String getActualCustomerServiceText() {
		String actualText = driver.findElement(customerService).getText();
		return actualText.toUpperCase();
	}

}
