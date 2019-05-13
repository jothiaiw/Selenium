package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class MyLeadPage extends Annotations{

	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Create Lead")  WebElement eleCreateLead;

	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}




}
