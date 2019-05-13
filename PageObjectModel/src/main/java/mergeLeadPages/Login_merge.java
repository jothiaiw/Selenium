package mergeLeadPages;

import design.ProjectMethods;

public class Login_merge extends ProjectMethods{
	
	public Login_merge enterUserName_a(String userName) {
		driver.findElementByName("USERNAME").clear();
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public Login_merge enterPassword_a(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public Homepage_merge_a clickLogin_a() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new Homepage_merge_a();
	}
		

}
