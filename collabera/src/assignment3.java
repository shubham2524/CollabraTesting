import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone ",Keys.ENTER);
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text() ='APPLE iPhone 12 (Black, 64 GB)']")).click();
		//Thread.sleep(2000);
		
		
		
		
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentwindowid);
		for(String childwindowid : allwindowid ) {
		driver.switchTo().window(childwindowid);
		}
		
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text () ='ADD TO CART']")).click();
		driver.switchTo().window(parentwindowid);	
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		
		//adding second product
		driver.findElement(By.name("q")).sendKeys("samsung ",Keys.ENTER);
		driver.findElement(By.xpath("//div[text() ='SAMSUNG Galaxy F12 (Celestial Black, 64 GB)']")).click();
		
		//String windowidofproduct2 = driver.getWindowHandle();
		
		String parentwindowid1 = driver.getWindowHandle();
		Set<String> allwindowid1 = driver.getWindowHandles();
		allwindowid1.remove(parentwindowid1);
		for(String windowidofproduct2 : allwindowid1 ) {
		driver.switchTo().window(windowidofproduct2);
		}
		
		
		
	
		driver.findElement(By.xpath("//button[text () ='ADD TO CART']")).click();
		driver.switchTo().window(parentwindowid1);
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("redmi ",Keys.ENTER);
		driver.findElement(By.xpath("//div[text() ='REDMI 9i Sport (Metallic Blue, 64 GB)']")).click();
		
		
		String parentwindowid2 = driver.getWindowHandle();
		Set<String> allwindowid2 = driver.getWindowHandles();
		allwindowid2.remove(parentwindowid2);
		for(String windowidofproduct3 : allwindowid2) {
		driver.switchTo().window(windowidofproduct3);
		}
		
		
		
	
		driver.findElement(By.xpath("//button[text () ='ADD TO CART']")).click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}


