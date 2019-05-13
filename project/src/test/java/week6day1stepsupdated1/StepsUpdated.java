package week6day1stepsupdated1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsUpdated {
public ChromeDriver driver;
	
	
	@Given("open Browser2")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver  = new ChromeDriver();
	}
	
	
	
	@And("Maximize2")
	public void Maximize()
	{
		driver.manage().window().maximize();
	}
	
	
	
	@And("Set Timeouts2")
	public void SetTimeouts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@And("Load URL2")
	public void LoadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	
	

	@And("Username1 as (.*)")
	public void Username(String Un)
	{
		driver.findElementById("username").sendKeys(Un);
	}
	

	@And("password1 as (.*)")
	public void password(String Pw)
	{
		driver.findElementById("password").sendKeys(Pw);
	}
	
	
	
	@When("click login button2")
    public void click_login_button() 
	{
		driver.findElementByClassName("decorativeSubmit").click();
    }
	

	

     @Then("verify login successful2")
     public void verify_login_successful() 
     {
    	 System.out.println("Login - Success");
     }


     @And("Click CRM2")
    public void CrmSfa() 
    {
    	 driver.findElementByLinkText("CRM/SFA").click();
    }


     
    @And("Click lead2")
    public void click_lead() 
    {
    	driver.findElementByLinkText("Leads").click();
    }
   
    
    

    @And("Create lead2")
    public void create_lead()
    {
    	driver.findElementByLinkText("Create Lead").click();
    }
    
    
    

    @And("Give cmpy name2 as (.*)")
    public void give_cmpy_name(String Cm)
    {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cm);
    }
    
    

   @And("Give first name2 as (.*)")
   public void give_first_name(String Fn) 
   {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fn);  
   }

   
   
   @And("Give last name2 as (.*)")
   public void give_last_name(String Ln) 
   {
		driver.findElementById("createLeadForm_lastName").sendKeys(Ln);
   }

   
   
   @And("Submit2")
   public void submit() 
   {
		driver.findElementByClassName("smallSubmit").click();
   }

   
   @And("verify completion2")
   public void verify_completion() 
   {
  	 System.out.println("Complted Successfully");
   }
}
