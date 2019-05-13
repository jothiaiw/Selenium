package week2day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdwn {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
	 
	WebElement drrp = driver.findElementById("userRegistrationForm:countries");
	 
   Select drppdwn = new Select(drrp);
   

   List<WebElement> options = drppdwn.getOptions();
	for (WebElement inpput : options) {
		String out = inpput.getText();
		System.out.println(out);
		
		
		
	}
	  
  }
   
	
	}

