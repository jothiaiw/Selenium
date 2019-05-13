package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Simple alert
		driver.findElementByXPath("//button[text() = 'Alert Box']").click();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		System.out.println("Success");
		
		//confirmation alert
		driver.findElementByXPath("//button[text() = 'Confirm Box']").click();
		driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
	 
		driver.findElementByXPath("//button[text() = 'Confirm Box']").click();
		driver.switchTo().alert();
		alert.dismiss();
		
		driver.findElementByXPath("//button[text() = 'Prompt Box']").click();
		driver.switchTo().alert();
		String alertMessage2= driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		alert.sendKeys("Jothi");
		alert.accept();
		

	}

}
