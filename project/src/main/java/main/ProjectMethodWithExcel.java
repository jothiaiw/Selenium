package main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5day2.ExcelForCreatLead;

public class ProjectMethodWithExcel {

		
		public ChromeDriver driver;
	//	private String sheetName;
		 
		 @Parameters({"url","username","password"})
		 
		 @BeforeMethod
		 
		public void startap(String url ,String un,String pw ) {
		
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
		 
		 @DataProvider(name = "FetchData")
			public String[][] getData(String loading) throws IOException {
			 ExcelForCreatLead excell = new ExcelForCreatLead();
				return excell.ExcelForCreat(loading);
		 }
		 
}


