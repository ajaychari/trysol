package testng;

import org.testng.annotations.Test;

import PomObjects.FBHomePageObjects;
import PomObjects.ForgotPassword;
import PomObjects.RegistrationObjects;

import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test(priority = 1)
  public void fbTitle() {
	  //verify title
	  String expectedtitle="Facebook – log in or sign up";
	  String title=driver.getTitle();
	  System.out.println(title);
	  if(title.equalsIgnoreCase(expectedtitle)) 
	  {
		  System.out.println("facebook homepage displayed");
		  
	  }
	  else
	  {
		  System.out.println("facebook not displayed");
	  }
		  
	
  }
  @Test(priority = 2)
  public void loginscript()
  {
	  // create object for home page
	  FBHomePageObjects fblogin=new FBHomePageObjects(driver);
	  fblogin.loginTestScript("meesaragandlaajay999@gmail", "hadfgsjfg"); 
	  
  }
  @Test(priority = 4)
  public void createaccount()
  {
	  FBHomePageObjects fbc=new FBHomePageObjects(driver);
	  fbc.createAccount();
	  RegistrationObjects regobj=new RegistrationObjects(driver);
	  regobj.firstName("ajay");
	  regobj.lastName("meesa");
	  regobj.emailAdd("meesaragandlaajay999@gmail.com");
	  regobj.reMail("meesaragandlaajay999@gmail.com");
	  regobj.password("hadfgsjfg");
	  regobj.selectByVisibleText("11");
	  regobj.selectmonthnumberbyvalue("Aug");
	  regobj.selectYear("1999");
	  regobj.maleRadio();
	  regobj.sigup();
  }
  @Test(priority = 3)
  public void forgotpassword() throws Exception
  {
	  FBHomePageObjects  Forpass=new FBHomePageObjects(driver);
	  Forpass.forgot();
	  //Forpass.enterLoginEmail("meesaragandlaajay999@gmail.com");
	  ForgotPassword gotPass=new ForgotPassword(driver);
	  gotPass.emailEntername("meesaragandlaajay");
	  Thread.sleep(3000);
	  gotPass.clickOnSearch();
	  Thread.sleep(3000);
	  driver.navigate().back();
  }
  @BeforeMethod
  public void beforeMethod() {
	  //launch test script
	  System.out.println("test case execution starts");
  }

  @AfterMethod
  public void afterMethod() {
	  //close testcase
	  System.out.println("test case is closed");
  }

  @BeforeTest
  public void beforeTest() {
	  //launch browser
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
	  //terminate browser
	  driver.quit();
  }

}
