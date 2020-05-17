package onlineStore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String args[]) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//main//java//driverResources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> prodList = (driver.findElements(By.xpath("//ul[@id='homefeatured']/li")));
		WebElement prodList1 = (driver.findElement(By.xpath("//ul[@id='homefeatured']/li")));
		//System.out.println(prodList1.getText());

		HashMap<String, String> hm = new HashMap<String, String>();
		String itemName;
		String price;

	
		/*
		 * for (int i = 1; i < prodList.size(); i++) { itemName =
		 * prodList1.findElement(By.xpath("["+
		 * String.valueOf(i)+"]"+"/div/div[2]/h5/a")).getText();
		 * System.out.println("Hi"); System.out.println(itemName);
		 * 
		 * }
		 */
		 
		 for(WebElement elem : prodList)
		 {
			 itemName = elem.findElement(By.xpath("div/div[2]/h5/a")).getText();
			 price = elem.findElement(By.xpath("div/div[2]/div[1]/span")).getText();
			 System.out.print(itemName+"||"+price);
			 System.out.println();
			 
		 }
		 

		driver.close();

	}

	public void printExcelData(int rowNum, String SheetName) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Mohit\\OneDrive\\Desktop\\Selenium\\excelFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(SheetName);
		Row row1 = sh.getRow(rowNum);
		System.out.println(row1.getCell(0).getStringCellValue());

	}
}
