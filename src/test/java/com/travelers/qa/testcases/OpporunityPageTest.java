package com.travelers.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.travelers.qa.base.TestBase;
import com.travelers.qa.pages.HomePage;
import com.travelers.qa.pages.LoginPage;
import com.travelers.qa.pages.OpportunityPage;
import com.travelers.qa.util.TestUtil;

public class OpporunityPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	OpportunityPage opporunityPage;
	String sheetName="opportunity";
	
	public OpporunityPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	loginPage =new LoginPage();
	homePage=new HomePage();
	homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@DataProvider
	public Object[][] getTravTestData() {
		Object[][] data=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getTravTestData")
	public void createNewOpportunityTest(String opporunityname, String accountname, String closedate, String amount){
		opporunityPage=homePage.clickOnOpportunity();
		opporunityPage.createNewOpportunity(opporunityname, accountname, closedate, amount);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
