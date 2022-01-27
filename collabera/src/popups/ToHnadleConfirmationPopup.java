package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHnadleConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/Home/Policy-Loan-Options#");
		driver.findElement(By.linkText("pay Direct (without login)")).click();
		
		
		Alert confirmationpopup = driver.switchTo().alert();
		System.out.println(confirmationpopup.getText());
		confirmationpopup.dismiss();

	}

}
