package pagefactoryTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactoryobjects.HomePageObjects;
import Pagefactoryobjects.Registration;

public class FbRegistration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//create an object home page
		HomePageObjects fbhpage=new HomePageObjects(driver);
		fbhpage.clickOnCreateAccount();
		//Thread.sleep(5000);
		//create object for RegistrationpageFB
		Registration regfb=new Registration(driver);
		Thread.sleep(5000);
		//enter data for all feilds
		//fname
		regfb.enterFirstName("kahskkhks");
		//lastname
		regfb.enterLastName("hsgjdgsj");
		//email
		regfb.enterEmail("hfgshdgj@gmail.com");
		//remail
		//regfb.enterRemail("hfgshdgj@gmail.com");
		//password
		regfb.enterPassword("gsfhgshghs");
		//select day
		regfb.selectday("12");
		//select month
		regfb.selectmonthbyvisibletext("Aug");
		//select year
		regfb.selectyearbyvisibletext("1995");
		// click on male
		regfb.male();
		//click on sign up
		regfb.clickOnSignUp();

	}

}
