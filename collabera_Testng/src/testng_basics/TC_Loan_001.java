package testng_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_001 {
	@Test(priority=1)
	public void createLoan() { //bydefault it will run alphabatical by methord name
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		
		driver.quit();
		
	}
	/*@Test(priority=2,dependsOnMethods ="createLoan")  //depends on create loan
	public void modifyLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.quit();
		
		
	}
	@Test(priority=3)
	public void repayLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		
	
}
	@Test(priority=4)
	public void deleteLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
		
	
}*/

}
