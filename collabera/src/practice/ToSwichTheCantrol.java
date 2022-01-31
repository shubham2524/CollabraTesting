package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwichTheCantrol {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
		

		driver.findElement(By.name("q")).sendKeys("iphone ",Keys.ENTER);
	
		
		driver.findElement(By.xpath("//div[text() ='APPLE iPhone 12 (Black, 64 GB)']")).click();
		
		/*
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentwindowid);
		for (String childwindowid : allwindowid) {
			driver.switchTo().window(childwindowid);
			
		}
		driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();*/
		
		Set<String> allwindowid = driver.getWindowHandles();
		String expectedtitle = "Buy Apple iPhone 12 ( 64 GB Storage ) Online at Best Price On Flipkart.com";
		for (String currentwindowid :allwindowid) {
			driver.switchTo().window(currentwindowid);
			String actualtitle = driver.getTitle();
			if (actualtitle.equals(expectedtitle)) {
				driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
				
			}
		}
		
	
		
		

	}

}
