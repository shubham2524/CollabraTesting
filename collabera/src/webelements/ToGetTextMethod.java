package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedtext  = "Please identify yourself";
		
		
		
		WebElement actualtext = driver.findElement(By.id("headerContainer"));
		String actualtexts = actualtext.getText();
		
		if (actualtexts.equals(expectedtext))
		{
			System.out.println("this is correct");
		}
		else
		{
			System.out.println("this is not correct ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
