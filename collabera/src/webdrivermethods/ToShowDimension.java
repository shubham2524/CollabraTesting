package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToShowDimension {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		

		Dimension dimension  = driver.manage().window().getSize();
		int height =dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("height:- "+height +"width "+width);
		
		Thread.sleep(2000);
		Dimension dimension1 = new Dimension(1216,500);
		driver.manage().window().setSize(dimension1);
		
	

	}

}
