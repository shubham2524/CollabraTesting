package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateByCssselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		
		
		WebElement searchbutton= driver.findElement(By.name("q"));
			searchbutton.sendKeys("java");
			
			Thread.sleep(2000);
			
			WebElement searchlogo = driver.findElement(By.cssSelector("input[value=go]"));
			searchlogo.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
