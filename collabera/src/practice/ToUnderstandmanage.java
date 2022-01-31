package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandmanage {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//TO MAXIMIZE THE WINDOW
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//TO TIMEOUT IMPLICIT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().fullscreen();
		
		//TO GET SIZE OF THE WINDOW
		Dimension sizeofwindow = driver.manage().window().getSize();
		System.out.println(sizeofwindow.getHeight()); 
		System.out.println(sizeofwindow.getWidth());
		
		
		//TO SET THE SIZE OF THE WINDOW
		Dimension dimention = new Dimension(1000, 500);
		driver.manage().window().setSize(dimention);
		
	
		
		//TO GET POSITION OF THE WINDOW
		Point positionofwindow = driver.manage().window().getPosition();
		System.out.println(positionofwindow.getX());
		System.out.println(positionofwindow.getY());
		
		//to set position of the window
		Point point = new Point(100,50);
		driver.manage().window().setPosition(point);
		
		//to page loadtime out
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		

	}

}
