package createLaedPages;


import design.ProjectMethods;

public class LoginPage extends ProjectMethods{
	

	public LoginPage enterUserName(String userName) {
		driver.findElementByName("USERNAME").clear();
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
	
	
	
	
	
	
}
