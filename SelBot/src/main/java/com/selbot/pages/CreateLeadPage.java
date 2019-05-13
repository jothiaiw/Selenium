package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations{

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")  WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName")  WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName")  WebElement eleLastName;
	@FindBy(how=How.NAME, using="submitButton") WebElement eleCreateLead;

	public CreateLeadPage enterCompanyName(String companyName) {
		clearAndType(eleCompanyName,companyName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName) {
		clearAndType(eleFirstName,firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		clearAndType(eleLastName,lastName);
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}





}
