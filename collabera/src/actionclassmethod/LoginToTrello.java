package actionclassmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("satyajeetsingh.official@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		
		
		driver.findElement(By.id("password")).sendKeys("Satya@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text ()='shubham']")).click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		
		WebElement srcElement = driver.findElement(By.xpath("//span[text() = 'sdlc']"));
		
		WebElement destElement = driver.findElement(By.xpath("//h2[text() ='java']/../..//span[text() = 'Add a card']"));
		//1ST METHORD
		//actions.dragAndDrop(srcElement, destElement).perform();
		Thread.sleep(2000);
		//2nd method
		//actions.dragAndDropBy(srcElement, 270, 150).perform();
		//3RD METHOD
		/*actions.clickAndHold(srcElement).moveByOffset(270, 156).perform();
		Thread.sleep(2000);
		actions.release().perform();*/
		
		actions.clickAndHold(srcElement).perform();//5th 
		actions.release(destElement).perform();//6th 
		
		
		
		
		
		
		
		
		
		
		

	}

}
