package testNGLearning;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.TestNGMainMethod;

public class CreateLeadWithExcel extends TestNGMainMethod {
	
		
		@Test(dataProvider = "ExcelData" )
		
	   public void Clead(String cname, String fname, String lname){
			
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
			

		}
		
		
	  }
	


