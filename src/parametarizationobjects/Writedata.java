package parametarizationobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.facebook.com/");
		String exceladdress="G:\\levitica training\\Testdata.xlsx";
		String Sheetname="Fblogin";
		String expectedtitle=Exceludf.readDataExcel(exceladdress, Sheetname, 1, 2);
		System.out.println(expectedtitle);
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		if(expectedtitle.equalsIgnoreCase(Actualtitle)==true)
		{
			Exceludf.writedataforsinglecell(exceladdress, Sheetname, 1, 4, "Facebook is displayed");
			Exceludf.writedataforsinglecell(exceladdress, Sheetname, 1, 5, "pass");
		}
		else
		{	
			Exceludf.writedataforsinglecell(exceladdress, Sheetname, 1, 4, "faccebook is not displaed");
			Exceludf.writedataforsinglecell(exceladdress, Sheetname, 1, 5, "fail");
		}
		

	}

	}


