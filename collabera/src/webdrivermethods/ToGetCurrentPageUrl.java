package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentPageUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		//System.out.println(driver.getTitle());                  //to get title
		System.out.println(driver.getCurrentUrl());             // to get url
		//System.out.println(driver.getPageSource());
		

	}

}
