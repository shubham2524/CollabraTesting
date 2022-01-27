import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealScriptForInstagram {

	public static void main(String[] args) {
		String testurl  = "https://www.instagram.com/";
		String username = "shubham";
		String password = "shubham@123";
		String expectedloginpagetitle = "Instagram";
		String expecetdhomepagetitle = "";
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("brouser launched successfully");
		driver.manage().window().maximize();
		System.out.println("brouser maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(testurl);
		String actualloginpagetitle = driver.getTitle();
		if (actualloginpagetitle.equals(expectedloginpagetitle)) {
			System.out.println("login page is displayed successfully");
		}
		else {
			System.out.println("login page is not displayed successfully");
		}
		
		
		WebElement usernametextfeild = driver.findElement(By.name("username"));
		usernametextfeild.clear();
		usernametextfeild.sendKeys(username);
		
		String actualusernameEntered = usernametextfeild.getAttribute("");
		
		
		
		
		//driver.findElement(By.name("username")).sendKeys("shubham");
		
		
		//driver.findElement(By.name("password")).sendKeys("Shubham@123");
		
		//driver.findElement(By.xpath("//div[text()= 'Log In']")).click();
		
		
		
		
		
		

	}

}
