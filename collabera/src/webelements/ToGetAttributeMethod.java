package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		Thread.sleep(2000);
		WebElement tooltiptext = driver.findElement(By.id("keepMeLoggedInCaptionContainer"));
		String actualtooltiptext = tooltiptext.getAttribute("title");
		String expectedtooltiptext = "Do not select if this computer is shared";
		if (actualtooltiptext.equals(expectedtooltiptext))
		{
			System.out.println("tooltiptext displayed right");
			
		}
		else
		{
			System.out.println("tooltiptext displayed wrong");
			
		}
		
		
		
		
		

	}

}
