package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsById {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement usernametextfeild = driver.findElement(By.id("username"));
		usernametextfeild.sendKeys("shubham");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("abcd123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		
		

	}

}
