package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils {

	WebDriver driver = null;
	Properties prop = null;
	File file = null;

	public WebDriver getWebdriver() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//utilities//data.properties");
		prop.load(file);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//main//java//driverResources//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src//main//java//driverResources//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public String printExcelData(int rowNum, String SheetName, WebDriver d) throws IOException
	{
		String excelLoc= System.getProperty("user.dir")+"\\src\\main\\java\\utilities\\excelFile.xlsx";
		FileInputStream fis = new FileInputStream(excelLoc);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(SheetName);
		Row row1 = sh.getRow(rowNum);
		return row1.getCell(0).getStringCellValue();
		
	}

}
