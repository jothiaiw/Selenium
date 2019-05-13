package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	
		
	    ChromeOptions ops = new ChromeOptions();

		
		ops.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(ops);

		driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@name = 'email']").sendKeys("7826010148");
		
		driver.findElementByXPath("//input[@name = 'pass']").sendKeys("jothi123");
		
		driver.findElementByXPath("//button[@name = 'login']").click();
		
		Thread.sleep(9000);
		
	    
		driver.findElementByXPath("//input[@placeholder ='Search'][1]").sendKeys("Testleaf");
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		
		driver.findElementByXPath("(//div[text() = 'Places'])[1]").click();
		
		driver.findElementByXPath("(//button[@data-testid= 'search_like_button_test_id'])").click();
		
		
		
		System.out.println("success");
		
		

	}

}
