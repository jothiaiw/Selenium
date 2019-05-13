package week5day2;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.ProjectMethod;

public class CreatLead extends ProjectMethod {
	
	//@Test(dataProvider = "output")
	
	@Test
	  public void cLead(String cn ,String fn,String ln ){
		 
	
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
	
	/*
	@DataProvider(name = "output")

	public String[][] getdata() {
		
		String[][] in = new String[2][3];
		
		in[0][0]  = "cmpy";
		in[0][1]  = "Jo";
		in[0][2]  = "b";
		
		
		in[1][0]  = "cmpy1";
		in[1][1]  = "Reva";
		in[1][2]  = "B";
		
		return in;*/
		
	// }
	}
