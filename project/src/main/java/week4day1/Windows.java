 package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Contact Us").click();		
		
		
		
		Set<String> allwindows = driver.getWindowHandles();
		
		List<String> ls =new ArrayList<>();
		ls.addAll(allwindows);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ls.get(1));
		
		
		System.out.println(driver.getTitle());
		
		
		//driver.findElementByXPath("//br[text()='Barakhamba Road, New Delhi 110001.']/following::p")
		
		
		System.out.println(ls.contains("Delhi"));
		

	}

}
