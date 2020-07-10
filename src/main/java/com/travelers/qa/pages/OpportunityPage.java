package com.travelers.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.travelers.qa.base.TestBase;

public class OpportunityPage extends TestBase {
	
	@FindBy(xpath = "//a[@title='New']//parent::li")
	WebElement newOppLink;
	@FindBy(xpath = "//span[text()='Opportunity Name']/parent::label/following-sibling::input")
	WebElement opporutnityName;
	@FindBy(xpath = "//input[@title='Search Accounts']")
	WebElement accountNameOnOpportunity;
	@FindBy(xpath = "//ul[@role='presentation']//descendant::div[@title='Test']")
	WebElement accountlookupOnOpportunity;
	@FindBy(xpath = "//div[@class='form-element']//child::input")
	WebElement closeDateOnOpportunity;
	@FindBy(xpath = "//span[text()='Stage']/parent::span/following-sibling::*")
	WebElement clickOnStageOnOpportunity;
	@FindBy(xpath = "//a[text()='Qualification']")
	WebElement selectStageOnOpportunity;
	@FindBy(xpath = "//span[text()='Amount']/parent::label/following-sibling::*")
	WebElement amountOnOpportunity;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement clickOnSaveOnOpportunity;
	
	public OpportunityPage() {
	PageFactory.initElements(driver, this);
	}
	
	public void createNewOpportunity(String oppName,String actName,String cldate,String amt) {
		newOppLink.click();
		opporutnityName.sendKeys(oppName);
		accountNameOnOpportunity.sendKeys(actName);
		accountlookupOnOpportunity.click();
		closeDateOnOpportunity.sendKeys(cldate);
		clickOnStageOnOpportunity.click();
		selectStageOnOpportunity.click();
		amountOnOpportunity.sendKeys(amt);
		clickOnSaveOnOpportunity.click();
		
	}
	

}
