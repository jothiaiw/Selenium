package editLeadPage;

import design.ProjectMethods;

public class LoginPage_edit_a extends ProjectMethods{

	public LoginPage_edit_a enterUserName(String userName) {
		driver.findElementByName("USERNAME").clear();
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public LoginPage_edit_a enterPassword(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage_edit_b clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage_edit_b();
	}
	
	
	
	
	
	
}
