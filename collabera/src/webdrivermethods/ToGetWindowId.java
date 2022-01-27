package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		
		Set<String> allwindowid = driver.getWindowHandles();
		for(String windowid1 : allwindowid ) {
		System.out.println(windowid1);
		}
		driver.quit();
		
		

	}

}
