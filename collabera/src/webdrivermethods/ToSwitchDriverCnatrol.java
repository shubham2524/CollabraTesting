package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchDriverCnatrol {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		

		Set<String> allwindowid = driver.getWindowHandles();
		String expectedwindowtitle ="ICICI";
		
		
	
		for(String windowid : allwindowid ) {
		driver.switchTo().window(windowid);
		String actualwindowtitle = driver.getTitle();
		if (expectedwindowtitle .equals(actualwindowtitle)) {
			driver.manage().window().maximize();
			break;
		}
				
		
		}

	}

}
