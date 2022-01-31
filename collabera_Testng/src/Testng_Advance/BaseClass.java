package Testng_Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;


public class BaseClass {
	public WebDriver driver;
	
	
	/*@BeforeSuite 
	public void modifyLoan1() {
		Reporter.log("from before suit",true);
		
	}
	@BeforeTest 
	public void modifyLoan2() {
		Reporter.log("from  before test",true);
		
	}*/
	@BeforeClass 
	public void modifyLoan3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		Reporter.log("brouser launched successfully",true);
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("brouser maximized successfully",true);
		driver.get("https://www.flipkart.com");
		
	}
	@BeforeMethod 
	public void modifyLoan4() {
		Reporter.log("from before method",true);
		
		
	}
	@AfterMethod 
	public void modifyLoan5() {
		Reporter.log("from after method",true);
		
		
	}
	@AfterClass 
	public void modifyLoan6() {
		Reporter.log("from ater class",true);
		
		
	}
	@AfterTest
	public void modifyLoan7() {
		Reporter.log("from ater test",true);
		
		
	}
	@AfterSuite
	public void modifyLoan8() {
		Reporter.log("from ater suit",true);
		
		
	}

}
