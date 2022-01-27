package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetRectSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//for left allignment and right alligment 
		
		WebElement logintextfeild = driver.findElement(By.id("email"));
		Rectangle logintextfeildx = logintextfeild.getRect();
		int usernamex = logintextfeildx.x;
		System.out.println(usernamex);
		
		int usernamewidth = logintextfeildx.width;
		System.out.println(usernamewidth);
		int userxsum =usernamex + usernamewidth;
		System.out.println(userxsum);
		
		
		
		WebElement passtextfeild = driver.findElement(By.id("passContainer"));
		Rectangle passtextfeildx = passtextfeild.getRect();
		int passwordx = passtextfeildx.x;
		System.out.println(passwordx);
		int passwordwidth =passtextfeildx.width;
		int passxsum =passwordwidth + passwordx;
		System.out.println(passxsum);
		
		
		
		if (userxsum==passxsum)
		{
			System.out.println("this is maching");
		}
		else
		{
			System.out.println("this is  not macching ");
		}
		
		
		
		
		
		

	}

}
