package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		WebElement item  =  driver.findElement(By.id("bas_searchfield"));
		Select select = new Select(item);
		select.selectByVisibleText("Website");
		driver.findElement(By.xpath("//input[@value=' Search Now ']")).click();
		
		
		WebElement signOutImage = driver.findElement(By.xpath("//span[text()=' Administrator']/../../..//img"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signOutImage).perform();
	
		WebElement signOutText = driver.findElement(By.linkText("Sign Out"));
		actions.moveToElement(signOutText).click().perform();


	}

}
