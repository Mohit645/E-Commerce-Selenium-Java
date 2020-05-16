package onlineStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//main//java//driverResources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=contact");
		WebElement uploader = driver.findElement(By.xpath("//input[@id='fileUpload']"));
		//uploader.click();
		uploader.sendKeys("C:\\Users\\Mohit\\intelquestions.txt");

}
}
