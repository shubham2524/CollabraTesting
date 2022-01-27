package selectmethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckDropdownIsMultiple {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://www.facebook.com/signup");
		
		
		WebElement daylistbox = driver.findElement(By.id("day"));
		WebElement monthlistbox = driver.findElement(By.id("month"));
		WebElement yearlistbox = driver.findElement(By.id("year"));
		
		
		
		Select dayselect = new Select(daylistbox);
		System.out.println(dayselect.isMultiple());
		
		Select monthselect = new Select(monthlistbox);
		System.out.println(monthselect.isMultiple());
		
		
		Select yearselect = new Select(yearlistbox);
		System.out.println(yearselect.isMultiple());
		
		//dayselect.selectByValue("2");
		//dayselect.selectByIndex(5);
		dayselect.selectByVisibleText("22");
		
		monthselect.selectByVisibleText("Oct");
		
		yearselect.selectByVisibleText("1994");*/
		
		
		driver.get("C:\\Users\\shubham\\Downloads/dropDown.html");
		WebElement multipleElements = driver.findElement(By.id("m1"));
		Select selectmultiple = new Select (multipleElements);
		
		System.out.println(selectmultiple.isMultiple());
		Thread.sleep(2000);
		
		selectmultiple.selectByIndex(2);
		Thread.sleep(2000);
		selectmultiple.selectByValue("3");
		Thread.sleep(2000);
		selectmultiple.selectByVisibleText("Mango");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	List<WebElement> daylistboxoption = dayselect.getOptions();
		for (WebElement ele: daylistboxoption ) {
			System.out.println(ele.getText());
		}*/
		}
		
	
		

	}


