package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchingChromeBrouser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shubham\\Desktop\\drivers\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		//launching firefox 
	
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shubham\\\\Desktop\\\\drivers\\\\chromedriver.exe");
		//ChromeDriver drivers1 = new ChromeDriver();
		//launching chromes driver 
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\shubham\\\\Desktop\\\\drivers\\\\msedgedriver.exe" );
		EdgeDriver driver2  = new EdgeDriver();
		
		
		System.setProperty("webdriver.chrome.driver","./drivers\\cd\\chromedriver.exe");
		ChromeDriver drivers3 = new ChromeDriver();
		
	
	
	
	}
	
	

}
