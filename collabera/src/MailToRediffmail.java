import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailToRediffmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediffmail.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumantheflfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'subject')]")).sendKeys("shubham");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("this is shubham");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(3000);
		
		
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Inbox")).click();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
