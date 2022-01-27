package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChildWindowOnly {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentwindowid);
		
		
		for (String windowid :allwindowid) {
			driver.switchTo().window(windowid);
			driver.close();	
		}
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("machenical");
		
		

	}

}
