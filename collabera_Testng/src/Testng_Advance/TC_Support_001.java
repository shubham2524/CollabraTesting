package Testng_Advance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Support_001 {
	
	

	@DataProvider
	public String [] sendMobileInfo() throws InvalidFormatException, IOException {
		//String [] arr = {"iphone12","redmi","samasung"};
		//return arr;
		FileInputStream fis = new FileInputStream("./TestResources/mobile.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet datasheet = workbook.getSheet("Sheet1");
		int rowcount = datasheet.getPhysicalNumberOfRows();
		String [] arr = new String[rowcount];
		for(int i = 0;i<rowcount;i++) {
			arr[i]= datasheet.getRow(i).getCell(0).getStringCellValue();
			
		}
		
		
		
		return arr;
		
		
	}
	
	@Test(dataProvider="sendMobileInfo")
	public void createRequest(String mobilename) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobilename,Keys.ENTER);
		driver.quit();
		
	}

}
