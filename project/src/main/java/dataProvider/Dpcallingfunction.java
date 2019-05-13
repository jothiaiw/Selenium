package dataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dpcallingfunction {
	
	
	@Test(dataProvider = "eachin" )

	public void Clead(String cname, String fname, String lname) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			ChromeDriver driver  = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("username").sendKeys("Demosalesmanager");
			
			driver.findElementById("password").sendKeys("crmsfa");
			
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
			//Click lead
			driver.findElementByLinkText("Leads").click();
			
			//Create lead
			driver.findElementByLinkText("Create Lead").click();
			
			//Give cmpy name
			driver.findElementById("createLeadForm_companyName").sendKeys(cname);
			
			//Give 1st name
			driver.findElementById("createLeadForm_firstName").sendKeys(fname);
			
			//Give last name
			driver.findElementById("createLeadForm_lastName").sendKeys(lname);
			
			//Submit
			driver.findElementByClassName("smallSubmit").click();
			
			System.out.println("Created lead - Success");
			
			driver.close();
			
			
	}

	@DataProvider(name= "eachin")
	
	public String[][] eout() throws IOException{
	
	Dpmainfunction inpt = new Dpmainfunction();
	
	String[][] finalout = inpt.exinput();
	return finalout;
	
	}

		}


