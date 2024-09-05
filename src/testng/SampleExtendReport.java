package testng;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PomObjects.FBHomePageObjects;
import PomObjects.ForgotPassword;
import PomObjects.RegistrationObjects;

public class SampleExtendReport {
	WebDriver driver;
	public  ExtentSparkReporter htmlReport;
	public  ExtentReports extentReport ;
	public  ExtentTest extentTest;
	
	  @Test(priority = 1)
	  public void fbTitle(Method testTitle) {
		  //verify title
		  String expectedtitle="Facebook – log in or sign up";
		  String title=driver.getTitle();
		  System.out.println(title);
		  extentTest=extentReport.createTest(testTitle.getName());
		  extentTest.info(testTitle.getName()+" Test Execution Starts");
		  if(title.equalsIgnoreCase(expectedtitle)) 
		  {
			  extentTest.info("facebook homepage is displayed");
			  extentTest.log(Status.PASS, testTitle.getName());
			  System.out.println("facebook homepage displayed");
			  
		  }
		  else
		  {
			  extentTest.info("facebook home page is not displayed");
			  extentTest.log(Status.FAIL, testTitle.getName());
			  System.out.println("facebook home page is not displayed");
		  }
			  
		
	  }
	  @Test(priority = 2)
	  public void loginscript(Method loginTest)
	  {
		  // create object for home page
		  FBHomePageObjects fblogin=new FBHomePageObjects(driver);
		  fblogin.loginTestScript("meesaragandlaajay999@gmail", "hadfgsjfg"); 
		  extentTest =extentReport.createTest(loginTest.getName());
		  extentTest.info(loginTest.getName()+" test execution started");
		  
	  }
	  @Test(priority = 4)
	  public void createaccount(Method titlecreateacc)
	  {
		  FBHomePageObjects fbc=new FBHomePageObjects(driver);
		  fbc.createAccount();
		  RegistrationObjects regobj=new RegistrationObjects(driver);
		  extentTest=extentReport.createTest(titlecreateacc.getName());
		  extentTest.info(titlecreateacc.getName()+"test execution start");
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
	  public void forgotpassword(Method forgot)
	  {
		  FBHomePageObjects  Forpass=new FBHomePageObjects(driver);
		  Forpass.forgot();
		  //Forpass.enterLoginEmail("meesaragandlaajay999@gmail.com");
		  ForgotPassword gotPass=new ForgotPassword(driver);
		  gotPass.emailEntername("meesaragandlaajay");
		  gotPass.clickOnSearch();
		  extentTest=extentReport.createTest(forgot.getName());
		  extentTest.info(forgot.getName()+"test execution starts");
		  driver.navigate().back();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  //launch test script
		  //launch browser
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");	 
		  }

	  @AfterMethod
	  public void afterMethod(ITestResult testresult) throws Exception {
		  //close testcase
		 // System.out.println("test case is closed");
		  if(testresult.getStatus()==ITestResult.SUCCESS)
		  {
			  extentTest.log(Status.PASS, testresult.getName()+"screenshot");
			  String pass=captureScreenShot(driver, testresult.getName());
			  extentTest.addScreenCaptureFromPath(pass);
			  
		  }
		  else if(testresult.getStatus()==ITestResult.FAILURE)
		  {
			  extentTest.log(Status.FAIL, testresult.getName()+" is failed ");
			  extentTest.log(Status.INFO, testresult.getThrowable());
			  String fail=captureScreenShot(driver, testresult.getName());
			  extentTest.addScreenCaptureFromPath(fail);
			  
		  }
		  else if(testresult.getStatus()==ITestResult.SKIP)
		  {
			  extentTest.log(Status.SKIP, testresult.getName()+"is skipped");
			  extentTest.log(Status.INFO, testresult.getThrowable());
			  String skip=captureScreenShot(driver, testresult.getName());
			  extentTest.addScreenCaptureFromPath(skip);
		  }
		  driver.quit();
		  extentReport.flush();
	  }
	  
	  @BeforeTest
	  public void setupExtent() {
		  //
		  htmlReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\test-output\\MyReport.html");
		  htmlReport.config().setDocumentTitle("MySampleReport");
		  htmlReport.config().setReportName("AutomationReport");
		  htmlReport.config().setTheme(Theme.DARK);
		  //Create extent report
		  extentReport=new ExtentReports();
		  //add test name
		  extentReport.setSystemInfo("hostname", "ajay");
		  extentReport.attachReporter(htmlReport);
		
		  		  
		 
	  }

	  @AfterTest
	  public void generateReport() {
		  //terminate browser
		 
		  //extentReport.close();
	  }
	  //capture screen shot method
	  public static String captureScreenShot(WebDriver driver,String filename) throws Exception 
	  {
		  //define simple date pattern
		  String dayname=new SimpleDateFormat("yyyy_MM_dd_hhmmss").format(new Date());
		  //define screen shot
		  TakesScreenshot screenshot=(TakesScreenshot)driver;
		  //capture source type
		  File sourcename=screenshot.getScreenshotAs(OutputType.FILE);
		  //setfile path
		  //String destinationPath="C:\\Users\\admin\\Pictures\\Screenshots\\"+dayname+filename+".png";
		  String destinationPath=System.getProperty("user.dir")+"\\Screenshots\\"+dayname+filename+".png";
		  
		  //path convert to file
		  
		  File destinationfile=new File(destinationPath);
		  //copy to destination folder
		  FileUtils.copyFile(sourcename, destinationfile);
		  return destinationPath;
		  
		  
		  
		
	  }
}
