package parametarizationobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PomObjects.FBHomePageObjects;

public class DataReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// create driver instance
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.facebook.com/");
		//create object for fbhomepage 
		//FBHomePageObjects Home=new FBHomePageObjects(driver);
		//retrive data excell ad
		String exceladress="G:\\levitica training\\Testdata.xlsx";
		/*String sheetname="login";
		String loginmail=Exceludf.readDataExcel(exceladress, sheetname, 1, 0);
		System.out.println(loginmail);
		String password=Exceludf.readDataExcel(exceladress, sheetname, 1, 1);
		System.out.println(password);
		Home.loginTestScript(loginmail,password);*/
		String Sheetname="Fblogin";
		String expectedtitle=Exceludf.readDataExcel(exceladress, Sheetname, 1, 2);
		System.out.println(expectedtitle);
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		if(expectedtitle.equalsIgnoreCase(Actualtitle)==true)
		{
			Exceludf.writedataforsinglecell(exceladress, Sheetname, 1, 4, "Facebook is displayed");
			Exceludf.writedataforsinglecell(exceladress, Sheetname, 1, 5, "pass");
		}
		else
		{	
			Exceludf.writedataforsinglecell(exceladress, Sheetname, 1, 4, "faccebook is not displaed");
			Exceludf.writedataforsinglecell(exceladress, Sheetname, 1, 5, "fail");
		}
		

	}

		
		
		
	}

