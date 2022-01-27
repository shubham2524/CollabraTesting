package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHnadleCalenderPopUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDateTime lct = LocalDateTime.now();
		String month = lct.getMonth().name();
		System.out.println(month);
		month =month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date  = lct.getDayOfMonth();
		int year = lct.getYear();
		
		
		
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		actions.click().perform();
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1,100);");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text() ='"+month+" "+year+"']/../..//p[text() ='"+date+"']")).click();
		 
		
		
		
		
		

	}

}
