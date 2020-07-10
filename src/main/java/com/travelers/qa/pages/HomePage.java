package com.travelers.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.travelers.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[text()='App Launcher']/parent::div")
	WebElement appLauncher;

	@FindBy(xpath = "//input[contains(@id,'input-') and @class='slds-input']//parent::div")
	WebElement inputTravApp;
	@FindBy(xpath = "//*[text()='Sales']//ancestor::one-app-launcher-menu-item")
	WebElement selectApp;
	@FindBy(xpath = "//span[@title='Sales']")
	WebElement selectedApp;
	@FindBy(xpath = "//span[text()='Sales']//parent::div")
	WebElement applogo;
	@FindBy(xpath = "//*[@data-id='Opportunity'][@role='listitem'] ")
	WebElement opportunityLink;
	


	 public  HomePage(){
			
		 PageFactory.initElements(driver, this);
	 }
	
	 public boolean verifyTravLogo() {
		 boolean logo=applogo.isDisplayed();
		 return logo;
		 //return driver.findElement(By.xpath("//span[text()='Sales']//parent::div")).isDisplayed();
		 
	 }
	 
	  public String verifyApplication() { 
		  appLauncher.click();
		  inputTravApp.sendKeys(prop.getProperty("Application")); selectApp.click();
		  return selectedApp.getText();
	  
	 }
	 public OpportunityPage clickOnOpportunity() {
		 opportunityLink.click(); 
		 return new OpportunityPage();
		 
	 } 
	  
	 

}
