package actionclassmethod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpandKey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		List<WebElement> navElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		Actions actions = new Actions(driver);
		for(WebElement ele : navElements) {

			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
			
			
		}
		String expectedewindowtitile = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		Set<String> allwindowid = driver.getWindowHandles();
		for(String windowid : allwindowid) {
			driver.switchTo().window(windowid);
			String actualwindowtitle = driver.getTitle();
			if(expectedewindowtitile.equals(actualwindowtitle)) {
				driver.close();
			}
			
		}
		
	
			
		

	}

}
