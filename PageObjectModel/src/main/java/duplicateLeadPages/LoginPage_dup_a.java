package duplicateLeadPages;

import design.ProjectMethods;

public class LoginPage_dup_a extends ProjectMethods{
		

	public LoginPage_dup_a enterUserName_a(String userName) {
		driver.findElementByName("USERNAME").clear();
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public LoginPage_dup_a enterPassword_a(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage_dup_b clickLogin_a() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage_dup_b();
	}
		
}
