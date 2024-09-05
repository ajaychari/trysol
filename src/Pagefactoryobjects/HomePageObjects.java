package Pagefactoryobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	//find the objects
	//find the login email
	//FindBy()//to identify objects two methods 1. property name and value
	//identify email
	@FindBy(id="email")
	WebElement loginEmail;
	// identify password 
	@FindBy(how = How.NAME,using="pass")
	WebElement loginPassword;
	// identify ok button
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	WebElement ok;
	// identify create account
	@FindBy(how=How.LINK_TEXT,using="Create new account")
	WebElement createAccount;
	
	WebDriver driver=null;
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver; 
		PageFactory.initElements(driver,this);
	}
	//define object methods
	// enter login email
	public void enterLoginMail(String email)
	{
		loginEmail.sendKeys(email);
		
	}
	//enter login password
	public void enterPassword(String password) 
	{
		loginPassword.sendKeys(password);
		
	}
	//
	public void clickOnOk() 
	{
		ok.click();
		
	}
	public void clickOnCreateAccount() 
	{
		createAccount.click();
	}
	//login test script
	public void testScript(String email,String password) 
	{
		enterLoginMail(email);
		enterPassword(password);
		clickOnOk();
	}

}
