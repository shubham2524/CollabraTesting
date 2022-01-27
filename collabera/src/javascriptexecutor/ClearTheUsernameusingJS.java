package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTheUsernameusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		//to clear username by java script
		WebElement utf = driver.findElement(By.id("username"));
		utf.sendKeys("shubham");
		Thread.sleep(2000);
		JavascriptExecutor js =  (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].value='';",utf);
		
		//js.executeScript("document.getElementById('usrename').style.border ='12px solid red';");
		
		//to get title
		String title =(String)js.executeScript("return document.title");
		System.out.println(title);
		
		
		//to refresh page 
		js.executeScript("history.go(0)");
		
		
		
		
		
		

	}

}
