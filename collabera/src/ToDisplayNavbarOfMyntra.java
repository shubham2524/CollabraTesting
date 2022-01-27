import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisplayNavbarOfMyntra {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		  List<WebElement> listofelementsnavbar = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		  
		  for (WebElement elements :listofelementsnavbar)
		  {
			  System.out.println(elements.getText());
		  }

	}

}

