package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchTheBrouser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	
	
	String windowid = driver.getWindowHandle();
	System.out.println(windowid);
	driver.get("https://www.myntra.com/");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
