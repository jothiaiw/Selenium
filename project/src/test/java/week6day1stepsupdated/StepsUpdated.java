package week6day1stepsupdated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsUpdated {
public ChromeDriver driver;
	
	
	@Given("open Browser1")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver  = new ChromeDriver();
	}
	
	
	
	@And("Maximize1")
	public void Maximize()
	{
		driver.manage().window().maximize();
	}
	
	
	
	@And("Set Timeouts1")
	public void SetTimeouts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@And("Load URL1")
	public void LoadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	
	

	@And("Username as (.*)")
	public void Username(String Un)
	{
		driver.findElementById("username").sendKeys(Un);
	}
	

	@And("password as (.*)")
	public void password(String Pw)
	{
		driver.findElementById("password").sendKeys(Pw);
	}
	
	
	
	@When("click login button1")
    public void click_login_button() 
	{
		driver.findElementByClassName("decorativeSubmit").click();
    }
	

	

     @Then("verify login successful1")
     public void verify_login_successful() 
     {
    	 System.out.println("Login - Success");
     }


    /* @And("Click CRM")
    public void CrmSfa() 
    {
    	 driver.findElementByLinkText("CRM/SFA").click();
    }


     
    @And("Click lead")
    public void click_lead() 
    {
    	driver.findElementByLinkText("Leads").click();
    }
   
    
    

    @And("Create lead")
    public void create_lead()
    {
    	driver.findElementByLinkText("Create Lead").click();
    }
    
    
    

    @And("Give cmpy name")
    public void give_cmpy_name()
    {
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro limited");
    }
    
    

   @And("Give first name")
   public void give_first_name() 
   {
		driver.findElementById("createLeadForm_firstName").sendKeys("Jothilakshmi");  
   }

   
   
   @And("Give last name")
   public void give_last_name() 
   {
		driver.findElementById("createLeadForm_lastName").sendKeys("B");
   }

   
   
   @And("Submit")
   public void submit() 
   {
		driver.findElementByClassName("smallSubmit").click();
   }

   
   @And("verify completion")
   public void verify_completion() 
   {
  	 System.out.println("Complted Successfully");
   }*/
}
