package week5.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
@Listeners(ExtentITestListenerClassAdapter.class)
public class ProjectSpecificMethod {

	public ChromeDriver driver;
	public String excelfilename;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException{
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(excelfilename);
	}
	 
	@AfterMethod
	public void logout() {
		driver.close();
	}
}
