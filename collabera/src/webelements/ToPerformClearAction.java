package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm");
		
		
		Thread.sleep(2000);
		WebElement usernametextfeild = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		
		usernametextfeild.clear();
		Thread.sleep(2000);
		usernametextfeild.sendKeys("shubham");
		
		Thread.sleep(2000);
		WebElement passwordtextfeild = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordtextfeild.clear();
		Thread.sleep(2000);
		
		passwordtextfeild.sendKeys("S@123");
		
		
		
		
		
		
		
		 
		 
		 

	}

}
