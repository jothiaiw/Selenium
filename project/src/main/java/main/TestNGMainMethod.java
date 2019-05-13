package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testNGLearning.CreateLeadWithExcel;


public class TestNGMainMethod {

	public ChromeDriver driver;
	
	@Parameters({"url","uname","pword"})
	
	
	@BeforeMethod
	
	public void Mainmethod(String url, String uname, String pword) throws InterruptedException {
		
		Thread.sleep(2000);
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	driver  = new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElementById("username").sendKeys(uname);
	
	driver.findElementById("password").sendKeys(pword);
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
}

	
	 @DataProvider(name = "ExcelData")
	public String ExcelInput(String input )
	{
		
		CreateLeadWithExcel excinput = new CreateLeadWithExcel();
		return excinput.ExcelInput(input);
		
	}
	
	
	
	
	@AfterMethod
	
	public void MainClose() {
	driver.close();
	}
	
}

