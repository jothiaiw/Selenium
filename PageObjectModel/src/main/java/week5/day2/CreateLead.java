package week5.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		excelfilename = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void cLead1(String cName,String fName,String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
	
	

}






