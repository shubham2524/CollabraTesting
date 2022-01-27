package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> listofsuggestion = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		List<WebElement> listofdetasuggestion = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		System.out.println(listofsuggestion.size());
		
		for(WebElement elmt :listofdetasuggestion)
		{
			System.out.println(elmt.getText());
		}
		
		
		

	}

}
