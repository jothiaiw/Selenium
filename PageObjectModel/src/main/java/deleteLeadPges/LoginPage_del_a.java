package deleteLeadPges;

import design.ProjectMethods;

public class LoginPage_del_a extends ProjectMethods{
		

	public LoginPage_del_a enterUserName_a(String userName) {
		driver.findElementByName("USERNAME").clear();
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public LoginPage_del_a enterPassword_a(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage_del_b clickLogin_a() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage_del_b();
	}
		
}
