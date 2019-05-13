package testNGLearning;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import main.ProjectMethod;
import main.TestNGMainMethod;

public class CreateLead extends TestNGMainMethod{
	
	@Test(dataProvider = "output")
	
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
	
  @DataProvider(name = "output")
	
	public String[][] getdata(){
	String[][] input = new String[3][3];
	input[0][0] = "Wipro limited" ;
	input[0][1] = "Jothi";
	input[0][2] = "B";
	input[1][0] = "Microsoft";
	input[1][1] = "Ramya ok";
	input[1][2] = "S";
	input[2][0] = "AGS";
	input[2][1] = "Ela";
	input[2][2] = "R";
  
	return input;
	
  }
}
