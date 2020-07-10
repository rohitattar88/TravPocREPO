package com.travelers.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travelers.qa.base.TestBase;

	public class LoginPage extends TestBase {

 @FindBy(name="username")
 WebElement username;

 @FindBy(id="password")
 WebElement password;
 
 @FindBy(id="Login")
 WebElement loginbtn;
 
 public  LoginPage(){
	
	 PageFactory.initElements(driver, this);
 }
 public  HomePage Login(String un,String pwd) 
 {
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
	
	 return new HomePage();
 
}
 
 }
 

