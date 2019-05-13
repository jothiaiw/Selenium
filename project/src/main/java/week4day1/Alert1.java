package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//iframe[@id = ''iframeResult]");
		
	    driver.switchTo().frame(1);

		
		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert alert =driver.switchTo().alert();

		
		System.out.println(alert.getText());
		
		Thread.sleep(1000);
		
		alert.sendKeys("JO");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
	}

}
