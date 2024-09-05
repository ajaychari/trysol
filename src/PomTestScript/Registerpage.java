package PomTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PomObjects.FBHomePageObjects;
import PomObjects.RegistrationObjects;

public class Registerpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		//open app
		driver.get("https://www.facebook.com/");
		//create fbhomepage object (for  perform click on create an new account)
		FBHomePageObjects fbhObj=new FBHomePageObjects(driver);
		fbhObj.createAccount();
		Thread.sleep(3000);
		//create registration object ( for enter details in registration fields)
		RegistrationObjects regObj=new RegistrationObjects(driver);
		regObj.firstName("ajay");
		regObj.lastName("meesaragandla");
		regObj.emailAdd("ajjajsds@gmail.com");
		regObj.reMail("ajjajsds@gmail.com");
		regObj.password("ahdghasghf");
		regObj.selectByVisibleText("12");
		regObj.selectmonthnumberbyvalue("Jan");
		regObj.selectYear("1999");
		regObj.maleRadio();
		//regObj.sigup();
		
	}

}
