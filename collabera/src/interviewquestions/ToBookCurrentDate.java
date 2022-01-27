package interviewquestions;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToBookCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDateTime lct = LocalDateTime.now();
		String month = lct.getMonth().name();
		System.out.println(month);
		month =month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date  = lct.getDayOfMonth();
		int year = lct.getYear();
		System.out.println(month);
		
		
	
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.travolook.in/?utm_campaign=SK_Generic_12March2021_Phrase&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAxJSPBhAoEiwAeO_fP_81tVV75hi_WrETangJorqplZnaTlDxFxMNkqOS2cErjLSilHV9rRoCaLEQAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[text() = 'Departure ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = '"+month+"']/../../..//span[text()='"+year+"']/../../..//a[text() ='"+date+"']")).click();
		
		

	}

}
