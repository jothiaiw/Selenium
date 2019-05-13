package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
      //  driver.switchTo().frame(0);
        
		
		//User ID
        driver.findElementById("userRegistrationForm:userName").sendKeys("jothi0511");
        
        //Password
        driver.findElementById("userRegistrationForm:password").sendKeys("jothi@0511");
        
        //Confirm Password
        driver.findElementById("userRegistrationForm:confpasword").sendKeys("jothi@0511");
        
       //Security Question
        WebElement dropdown1 = driver.findElementById("userRegistrationForm:securityQ");
        Select dropdown = new Select(dropdown1);
        dropdown.selectByIndex(2);
        
        //Security Answer
        driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("jothi");
        
        //Preferred Language - No update needed
        
        
        
        //First Name 
        driver.findElementById("userRegistrationForm:firstName").sendKeys("jothi");
        
        
        //Middle Name
        driver.findElementById("userRegistrationForm:firstName").sendKeys("lakshmi");
        
        //Last Name
        driver.findElementById("userRegistrationForm:middleName").sendKeys("B");
             
        //Gender(radio button)
        driver.findElement(By.id("userRegistrationForm:gender:1")).click();
        
        
        //Marital Status
        driver.findElement(By.id("userRegistrationForm:maritalStatus:1")).click();
        
        
       //Date Of Birth
        
        WebElement drp1 = driver.findElementById("userRegistrationForm:dobDay");
        Select drpd1 = new Select(drp1);
        drpd1.selectByIndex(29);
        
        WebElement drp2 = driver.findElementById("userRegistrationForm:dobMonth");
        Select drpd2 = new Select(drp2);
        drpd2.selectByValue("07");
        
        WebElement drp3 = driver.findElementById("userRegistrationForm:dateOfBirth");
        Select drpd3 = new Select(drp3);
        drpd3.selectByVisibleText("1996");
        
        
        
        //Occupation 
        WebElement drpdown1 = driver.findElementById("userRegistrationForm:occupation");
        Select drpdown = new Select(drpdown1);
        drpdown.selectByIndex(2);
        
      //Aadhaar Card No
        driver.findElementById("userRegistrationForm:uidno").sendKeys("1234455665433");
        
      //PAN Card
        driver.findElementById("userRegistrationForm:idno").sendKeys("234455665433");
        
        
        //Country
        WebElement drpdwn1 = driver.findElementById("userRegistrationForm:countries");
        Select drpdwn = new Select(drpdwn1);
        drpdwn.selectByVisibleText("India");
        
        
        //Email
        driver.findElementById("userRegistrationForm:email").sendKeys("jothi@gmail.com");
        
        //ISD-Mobile
        driver.findElementById("userRegistrationForm:mobile").sendKeys("7639959986");
        
        //Nationality
        WebElement drp4 = driver.findElementById("userRegistrationForm:nationalityId");
        Select drpd4 = new Select(drp4);
        drpd4.selectByVisibleText("India");
        
        //Flat/Door/Block No
        driver.findElementById("userRegistrationForm:address").sendKeys("D 130");
        
        //Street/Lane
        driver.findElementById("userRegistrationForm:street").sendKeys("us");
        
        
        //Area/Locality
        driver.findElementById("userRegistrationForm:area").sendKeys("sn");	
        
        
        //pin code
        driver.findElementById("userRegistrationForm:pincode").sendKeys("600032");
        
        
        
        //state -auto assign
       
        driver.findElementById("userRegistrationForm:statesName").click();
        
      
        Thread.sleep(3000);
        
        //City/Town 
        WebElement drp5 = driver.findElementById("userRegistrationForm:cityName");
        Select drpd5 = new Select(drp5);
        drpd5.selectByIndex(1);
        
        Thread.sleep(3000);
        
        //Post Office
        WebElement drp6 = driver.findElementById("userRegistrationForm:postofficeName");
        Select drpd6 = new Select(drp6);
        drpd6.selectByIndex(1);
        
        
        //phone
        driver.findElementById("userRegistrationForm:landline").sendKeys("854554334");	
   
        
        //Copy Residence to office Address - no update
        
        
        System.out.println("success");

	}

}
