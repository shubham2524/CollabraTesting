package Assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToResizeWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//before maximize
		driver.get("https://www.flipkart.com");
		
		
		
		Dimension dimension = driver.manage().window().getSize();
		int height =dimension.height;
		int width = dimension.width;
		System.out.println("height :-"+height+"  width:-"+width);
		Thread.sleep(2000);
		
		//after maximize
		
		driver.manage().window().maximize();
		
         driver.get("https://www.flipkart.com");
		
		
		
		Dimension dimension1 = driver.manage().window().getSize();
		int heights =dimension1.height;
		int widths = dimension1.width;
		System.out.println("height :-"+heights+"  width:-"+widths);
		
		Dimension dimension2 = new Dimension(100,200);
		driver.manage().window().setSize(dimension2);
		
		
		
		
		
		
		


	}

}
