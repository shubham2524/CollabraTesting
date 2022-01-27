package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		
		
		JavascriptExecutor js =  (JavascriptExecutor) driver; 
		Thread.sleep(2000);
		WebElement findelementsbyelement = driver.findElement(By.linkText("TALK TO OUR EXPERTS"));
		js.executeScript("arguments[0].scrollIntoView(false);",findelementsbyelement);
		
		

	}

}
