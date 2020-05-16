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
		driver.get("https://fb.com");
		WebElement username = driver.findElement(By.xpath("//div[@id='u_0_p']/div[1]/div[1]"));
		//username.sendKeys("Hi");
		String classname = username.getAttribute("class");
		System.out.println(username.getText());
		System.out.println(classname);
		driver.close();
	}

}
