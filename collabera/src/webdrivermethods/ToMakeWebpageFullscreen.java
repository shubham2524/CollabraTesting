package webdrivermethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeWebpageFullscreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		

	}

}
