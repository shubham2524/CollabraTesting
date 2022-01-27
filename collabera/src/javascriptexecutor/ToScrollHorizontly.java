package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontly {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		
		
		JavascriptExecutor js =  (JavascriptExecutor) driver; //typecasting from webdriver to java script executor to call javascriptexecutor method
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,1000)");
		
		/*js.executeScript("document.getElementById('youtube_id').scrollInToViews(false);");*/
		WebElement elementscroll = driver.findElement(By.xpath("//h3[text()='Course Review & Rating']"));
		
		
		js.executeScript("arguments[0].scrollIntoView(false);",elementscroll);
		
			
			

	}

}
