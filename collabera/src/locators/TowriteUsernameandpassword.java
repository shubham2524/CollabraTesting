package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TowriteUsernameandpassword {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("input[aria-label=\'Phone number, username, or email\']")).sendKeys("9939200929");
		
		
		driver.findElement(By.cssSelector("input[aria-label=\'Password\']")).sendKeys("Shubham@1223");*/
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		driver1.findElement(By.cssSelector("input[placeholder=\'Search for restaurant, cuisine or a dish\']")).sendKeys("butter chicken");
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("svg[class= \'sc-rbbb40-0 gvsUip\']")).click();
		driver1.navigate().forward();
		Thread.sleep(2000);
		
		
		//driver1.navigate().forward();
		
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.cssSelector("input[placeholder =\'type here...\']")).sendKeys("9939200929");
		
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//span[text() ='Share App Link']")).click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
