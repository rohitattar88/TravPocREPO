/*author Rohit A
 * 
 * 
 */

package com.travelers.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travelers.qa.base.TestBase;
import com.travelers.qa.pages.HomePage;
import com.travelers.qa.pages.LoginPage;
import com.travelers.qa.util.TestUtil;

public class HomePageTest extends TestBase {
LoginPage loginPage;
HomePage homePage;
TestUtil testUtil;
	
public HomePageTest()  {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
	loginPage =new LoginPage();
	homePage=new HomePage();
	homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyApplicationTest() {
		String apptext=homePage.verifyApplication();
		Assert.assertEquals(apptext, prop.getProperty("Application"), "App is different");
	}
	
	@Test(priority=2)
	public void verifyTravLogoTest() {
		boolean flag=homePage.verifyTravLogo();
		Assert.assertTrue(flag);	
	}
	
	@AfterMethod public void tearDown() { 
		 driver.quit(); 
		 
	}	
}