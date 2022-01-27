package testng_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_002 {     //testng class
	/*@Test(priority=2,enabled=false)// it will not run -----enabled
	public void deleteLoan() {        //test case
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.quit();
		
		
	}*/
	@Test//(invocationCount=2,threadPoolSize=4)// if you want to run same testcase multiple timesss parallelly...threadpoolsize
	public void lenovo() {        //test case
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenovo.com/");
		driver.quit();
		
		
		
	}


}
