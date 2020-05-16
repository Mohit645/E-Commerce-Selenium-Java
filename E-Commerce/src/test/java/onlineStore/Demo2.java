package onlineStore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String args[]) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//main//java//driverResources//chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php?controller=contact");
		//WebElement uploader = driver.findElement(By.xpath("//input[@id='fileUpload']"));
		//uploader.click();
		//uploader.sendKeys("C:\\Users\\Mohit\\intelquestions.txt");
		Demo2 d = new Demo2();
		d.printExcelData(1, "ContactPage");

}
	
	public void printExcelData(int rowNum, String SheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Mohit\\OneDrive\\Desktop\\Selenium\\excelFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(SheetName);
		Row row1 = sh.getRow(rowNum);
		System.out.println(row1.getCell(0).getStringCellValue());
		
	}
}
