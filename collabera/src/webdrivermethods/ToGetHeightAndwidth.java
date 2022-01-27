package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetHeightAndwidth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().getSize();
		
		
		Dimension dimension  = driver.manage().window().getSize();
		int height =dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("height:- "+height +"width "+width);
		

	}

}
