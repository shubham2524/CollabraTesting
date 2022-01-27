package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingSubmitMethod {

	public static void main(String[] args) {
		// it should be child of form  tag and 1 attribute is called type = "submit
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		
		//driver.findElement(By.xpath());

	}

}
