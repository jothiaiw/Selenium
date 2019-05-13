package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")  WebElement eleCompanyName;

	public ViewLeadPage verifyCompanyName(String data) {
		String companyName = getElementText(eleCompanyName);
		if (companyName.contains(data)) {
			System.out.println("The Company Name is Matching Successfully ");
		} else {
			System.out.println("The Company Name is not Matching ");
		}
		return this;
	}






}
