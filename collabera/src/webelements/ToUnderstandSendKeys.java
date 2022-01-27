package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		
		
		WebElement emailtextfeild = driver.findElement(By.id("email"));
		emailtextfeild.clear();
		emailtextfeild.sendKeys("shubham",Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailtextfeild.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordtextfeild = driver.findElement(By.name("password"));
		passwordtextfeild.clear();
		passwordtextfeild.sendKeys(Keys.CONTROL+"v");
		
		
	}

}
