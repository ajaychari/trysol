package pagefactoryTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactoryobjects.HomePageObjects;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		//Open application
		driver.get("https://www.facebook.com/");
		
		//create object
	
		HomePageObjects FbHomeobj=new HomePageObjects(driver);
		/*FbHomeobj.enterLoginMail("ajay@gmail.com");
		FbHomeobj.enterPassword("password");
		FbHomeobj.clickOnOk();*/
		FbHomeobj.testScript("ajay99", "ajshkda");
		
		
    		
	}

}
