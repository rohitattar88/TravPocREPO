package com.travelers.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.travelers.qa.base.TestBase;
import com.travelers.qa.pages.HomePage;
import com.travelers.qa.pages.LoginPage;

import jdk.internal.org.jline.utils.Log;


public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Logger log=Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		log.info("*****************************Starting test case execution********************************************");
		initialization();
		log.info("****************************launching Chrome browser & entering application URL************************");
		loginPage =new LoginPage();
		
	}
	
	@Test
	public void loginTest() {
		log.info("*****************************Entering username & password for login***************************************");
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("*****************************Browser is closed***************************************");
		
	}
}

