package onlineStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	public WebDriver driver;
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signIn = By.xpath("//div/a[@class='login']");
	By auth = By.xpath("//div[@id='center_column']/h1");
	By createEmail = By.xpath("//input[@id='email_create']");
	By createAccountButton = By.xpath("//button[@id='SubmitCreate']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By forgotPassword = By.xpath("//p[@class='lost_password form-group']/a");
	By signInButton = By.xpath("//button[@id='SubmitLogin']");
	By accountExistsMessage = By.xpath("//ol/li");
	
	public void clickSignInTab()
	{
		driver.findElement(signIn).click();
	}
	public String getAuth()
	{
		return driver.findElement(auth).getText().toUpperCase();
	}
	public void enterCreateEmail()
	{
		driver.findElement(createEmail).sendKeys("tony@outlook.com");
	}
	public void clickCreateAccountButton()
	{
		driver.findElement(createAccountButton).click();
	}
	public void enterEmail()
	{
		driver.findElement(createEmail).sendKeys("");
	}
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("");
	}
	public void clickForgotPassword()
	{
		driver.findElement(forgotPassword).click();
	}
	public void clickSignInButton()
	{
		driver.findElement(signInButton).click();
	}
	public String getAccountExistsMessage()
	{
		return driver.findElement(accountExistsMessage).getText();
	}
}
