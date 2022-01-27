package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateForwardBackRefrash {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.get("https://www.zomato.com/");
		
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		
	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
