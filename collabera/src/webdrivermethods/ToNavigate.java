package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		URL url = new URL("https://www.zomato.com");
		driver.navigate().to("https://www.zomato.com");
		

	}

}
