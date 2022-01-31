package takinscreenshort;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshorts {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		
		File screenshorts = driver.getScreenshotAs(OutputType.FILE);//here return type depends on parameter that we pass.
		System.out.println(screenshorts);
		File destinationfile = new File("./erroshorts/screenshort56.jpeg");
		FileUtils.copyFile(screenshorts, destinationfile);
		
		/*screenshorts.renameTo(destinationfile);
		
		File webelementscreenshort = driver.findElement(By.xpath("//button[.='Share App Link']")).getScreenshotAs(OutputType.FILE);
		
		File webelementscreenshortdest = new File("./erroshorts/webelement1.jpeg");
		
		webelementscreenshort.renameTo(webelementscreenshortdest);*/
	}
	

}
