package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenShorts {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temploc = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temploc);
		
		File destination = new File("./erroshorts/screenshort48.jpeg");
		FileUtils.copyFile(temploc, destination);
		
		

	}

}
