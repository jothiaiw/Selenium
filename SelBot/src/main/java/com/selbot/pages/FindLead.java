package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;


public class FindLead extends Annotations{
	
	public FindLead() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Find Leads")  WebElement eleDuplicateLead;

	public Phpage clickCreateLead() {
		click(eleDuplicateLead);
		return new Phpage();
	}


}
