package week5day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.ProjectMethodWithExcel;

public class CreateLeadWithExcel extends ProjectMethodWithExcel{
  

	@BeforeTest
	public void setData(String loading) {
		loading = "loading";
		//dataSheetName = "loading";
	}
	
	

@Test
	public void cretLead(String cn,String fn,String ln ){
			 
			
		       //Click lead
				driver.findElementByLinkText("Leads").click();
				
				//Create lead
				driver.findElementByLinkText("Create Lead").click();
				
				//Give cmpy name
				driver.findElementById("createLeadForm_companyName").sendKeys(cn);
				
				//Give 1st name
				driver.findElementById("createLeadForm_firstName").sendKeys(fn);
				
				//Give last name
				driver.findElementById("createLeadForm_lastName").sendKeys(ln);
				
				//Submit
				driver.findElementByClassName("smallSubmit").click();
				
				System.out.println("Created lead - Success");
				
				driver.close();
				
		  }
		

	}


