package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		
		WebElement catogriesbutton = driver.findElement(By.className("dropdown-toggle"));
		catogriesbutton.click();
		
	//	WebElement searchbutton= driver.findElement(By.name("q"));
		//searchbutton.sendKeys("compuet science");
		
		
		WebElement searchbutton1= driver.findElement(By.tagName("a"));
		searchbutton1.click();
		
		
		//searchbutton1.click();
		
	}

}
