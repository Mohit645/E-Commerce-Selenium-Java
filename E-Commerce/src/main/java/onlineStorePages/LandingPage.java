package onlineStorePages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;	
	
	By productList = By.xpath("//ul[@id='homefeatured']/li");
	
	public LandingPage(WebDriver driver) throws IOException {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public String returnTitle()
	{
		return driver.getTitle(); 
	}
	
	public HashMap<String, String> getPopularProductList()
	{
		List<WebElement> prodList = driver.findElements(productList);
		String itemName = null;
		String price = null;
		HashMap<String, String> hm = new HashMap<String, String>();
		 for(WebElement elem : prodList)
		 {
			 itemName = elem.findElement(By.xpath("div/div[2]/h5/a")).getText();
			 price = elem.findElement(By.xpath("div/div[2]/div[1]/span")).getText();
			 hm.put(price, itemName);
			 
		 }
		 return hm;
	}
	
	public HashMap<String, String> getExpectedPopularProductList()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("$16.51", "Faded Short Sleeve T-shirts");
		hm.put("$27.00", "Blouse");
		hm.put("$26.00", "Printed Dress");
		hm.put("$50.99", "Printed Dress");
		hm.put("$28.98", "Printed Summer Dress");
		hm.put("$30.50", "Printed Summer Dress");
		hm.put("$16.40", "Printed Chiffon Dress");
		
		return hm;
	}
	

	


}
