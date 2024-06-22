import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.globalsqa.com/demo-site/frames-and-windows/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li#iFrame")).click();
		
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame("globalSqa");
		//Thread.sleep(5000);
		String fbURL = "a[title='Facebook'][style='opacity: 0.8;']";
				
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(fbURL))));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("span#current_filter")))
		.moveToElement(driver.findElement(By.cssSelector("ul#filter_list > li >div[data-option-value*='performance']")))
		.click().build().perform();	
		driver.navigate().refresh();
	//	WebElement elem2 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul#filter_list > li >div[data-option-value*='performance']")));
	//	driver.findElement(By.cssSelector("ul#filter_list > li >div[data-option-value*='performance']")).click();		
		
		//driver.findElement(By.cssSelector("span#current_filter"));
	//	driver.quit();		
	}

}

