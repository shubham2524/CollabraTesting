package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextRealExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		
		String expectederrormessage = "Email Field Is Required";
		
		 WebElement actualerrormessage = driver.findElement(By.id("email-error"));
		 String actualmessage = actualerrormessage.getText();
		 
		 if (actualmessage.equals(expectederrormessage))
		 {
			 System.out.println("right message is displayed");
		 }
		 else
		 {
			 System.out.println("wrong element is dispalyed");
		 }
		 
		 
		
	}

}
