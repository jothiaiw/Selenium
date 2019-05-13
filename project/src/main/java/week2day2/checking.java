package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checking {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 
		
		WebElement checking = driver.findElement(By.id("userRegistrationForm:gender:1"));
		
		 boolean op1 = checking.isDisplayed();
		 System.out.println(op1);
		
		 boolean op2 =checking.isEnabled();
		 System.out.println(op2);
		
		 boolean op3 =checking.isSelected();
		 System.out.println(op3);
		
		checking.click();
		
	
	}
	
	
	

}
