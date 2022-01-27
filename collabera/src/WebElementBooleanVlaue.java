import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBooleanVlaue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:www.instagram.com/");
		Thread.sleep(2000);
		WebElement utf = driver.findElement(By.name("username"));
		WebElement ptf = driver.findElement(By.name("password"));
		WebElement lb = driver.findElement(By.xpath("//button[.='Log In']"));
		
		//System.out.println(lb.isEnabled());
		Thread.sleep(2000);
		utf.sendKeys("shubham");
		Thread.sleep(2000);
		ptf.sendKeys("shubham@123");
		Thread.sleep(2000);
		
		System.out.println(lb.isEnabled());
		
		

	}

}
