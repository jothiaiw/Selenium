package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


// class declaration
public class ProjectMethod {
	
	
	
	 public ChromeDriver driver;
	 
	 @Parameters({"url","username","password"})
	 
	 
	 //method declaration
	 
	 @BeforeMethod
	 
	public void startapp(String url ,String un,String pw ) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	driver  = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	
	
	driver.findElementById("username").sendKeys(un);
	
	driver.findElementById("password").sendKeys(pw);
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	}
}
