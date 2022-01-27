package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseCurrentPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		
		//driver.close();//close current page only
		driver.quit();
		
		

	}

}
