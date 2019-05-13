package design;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import utils.DataInputProvider;


@Listeners(ExtentITestListenerClassAdapter.class) 

public class ProjectMethods {
	 
	public static ChromeDriver driver;
	public String dataSheetName;
	
	@Parameters({"url","username","password"})
	
	
	@BeforeMethod
	public void startApp(String site, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return DataInputProvider.getSheet(dataSheetName);
	}
	
	
	
	
	
	
	

}
