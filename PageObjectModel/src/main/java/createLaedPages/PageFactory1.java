package createLaedPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import design.ProjectMethods;

public class PageFactory1 extends ProjectMethods {

	public PageFactory1() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.NAME, using= "USERNAME" )
	WebElement Uname;
	
	
	@FindBy(how=How.ID, using= "password" )
	WebElement Pword;
	
	@FindBy(how=How.CLASS_NAME, using= "decorativeSubmit" )
	WebElement Login;
	
	
	/*	public PageFactory1 enterUserName1(String userName) {
			Uname.clear();
			Uname.sendKeys(userName);
			return this;
		}
		
		public PageFactory1 enterPassword1(String password) {
			Pword.clear();
			Pword.sendKeys(password);
			return this;
		}
		
		public HomePage clickLogin1() {
			Login.click();
			return new HomePage();
		}*/
	
	
	public PageFactory1 enterUserName1(String userName) {
		Uname.clear();
		Uname.getAttribute(userName);
		return this;
	}
	
	public PageFactory1 enterPassword1(String password) {
		Pword.clear();
		Pword.getAttribute(password);
		return this;
	}
	
	public HomePage clickLogin1() {
		Login.click();
		return new HomePage();
	}
		
		
}
