package PomTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomObjects.FBHomePageObjects;

public class FBLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance 
		WebDriver driver=new ChromeDriver();
		//open test application
		driver.get("https://www.facebook.com/");
		//create object for class
		FBHomePageObjects fbhObj=new FBHomePageObjects(driver);
		//entire login process  with  3 different objects
		/*//enter login email
		fbhObj.enterLoginEmail("ajaychariMeesa");
		Thread.sleep(1000);
		//enter password
		fbhObj.enterLoginPassword("hajdhsjagdjgsjgd");
		Thread.sleep(1000);
		//click ok
		fbhObj.clickOkButton();*/
		
		
		// entire login process in one method
		fbhObj.loginTestScript("7780478713","ajaychari");
		
		

	}

}
