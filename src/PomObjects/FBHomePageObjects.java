package PomObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBHomePageObjects {
	//create browser instance
	  WebDriver driver=null;
	//define email locator
	 By Objemail=By.id("email");
	//define pwd locator
	 By ObjPwd=By.id("pass");
	 //define login button
	 By ObjOk=By.xpath("//button[@type='submit']");
	 //define create new account
	 By ObjCreate=By.linkText("Create new account");
	 //define forgot password
	 By ObjForgotPas=By.linkText("Forgotten password?");
	 //define constructor
	 public FBHomePageObjects(WebDriver driver) 
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	 } 
	 // object methods
	 // define methods
	 //1. enter login email
	 public void enterLoginEmail(String testEmail) 
	 {
		driver.findElement(Objemail).sendKeys(testEmail); 
		
	 }
	 //2.enter password
	 public void enterLoginPassword(String testPassword) 
	 {
		driver.findElement(ObjPwd).sendKeys(testPassword);
	 }
	 //3.click on login button
	 public void clickOkButton() 
	 {
		driver.findElement(ObjOk).click();
	 }
	 public void createAccount() 
	 {
		driver.findElement(ObjCreate).click();
	 }
	 public void forgot() 
	 {
		driver.findElement(ObjForgotPas).click();
	 }
	 //login test script
	 public void loginTestScript(String testEmail,String testPassword) 
	 {
		 enterLoginEmail(testEmail);
		 enterLoginPassword(testPassword);
		 //clickOkButton();
		 forgot();
	 }
}
