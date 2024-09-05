package simpleframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open application
		driver.get("https://www.facebook.com/");
		String exceladdress="G:\\levitica training\\Testdata.xlsx";
		String sheetname="createaccount";
		// row count
		int rows=ExcelFunctions.rowCount(exceladdress, sheetname);
		System.out.println(rows);
		//to read property name, property value, and method
		for(int i=1;i<=rows;i++)
		{
			//read object name
			String objectname=ExcelFunctions.readDataExcel(exceladdress, sheetname, i, 0);
			System.out.println(objectname);
			//reed property name
			String Propertyname=ExcelFunctions.readDataExcel(exceladdress, sheetname, i, 1);
			System.out.println(Propertyname);
			//read property value
			String Propertyvalue=ExcelFunctions.readDataExcel(exceladdress, sheetname, i, 2);
			System.out.println(Propertyvalue);
			//read method
			String methodname=ExcelFunctions.readDataExcel(exceladdress, sheetname, i, 3);
			System.out.println(methodname);
			//read object locators
			By objlocator=ObjectIdentificationProcess.objectLocator(Propertyname, Propertyvalue);
			//identify the object
			WebElement objgenaral=driver.findElement(objlocator);
			//execution based on method
			switch (methodname) 
			{
			case "radioclick()":
				objgenaral.click();
				if(objgenaral.isSelected())
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7, objectname+"is selected");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "pass");
				}
				else
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7, objectname+"is not selected");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "faill");
					
				}
				break;
			case "click()":
				objgenaral.click();
				if(objgenaral.isEnabled())
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7, "button is clicked");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "pass");
				}
				else
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7,"button not clicked");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "fail");
				}
				
				break;
			case "sendkeys":
				//data read from excel
				String testdata=ExcelFunctions.readDataExcel(exceladdress, sheetname, i,4);
				objgenaral.sendKeys(testdata);
				//capture data
				String appData=objgenaral.getAttribute("value");
				if(appData.equalsIgnoreCase(testdata))
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7,"data enter");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8,"passed");
				}
				else
				{
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7, "data not entered");
					ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "fail");
				}
				
				break;
			case "isSelected":
			String test=ExcelFunctions.readDataExcel(exceladdress, sheetname, i, 4);
			System.out.println(test);
			//objconvert to select
			Select elementselect=new Select(objgenaral);
			elementselect.selectByVisibleText(test);
			//capture data
			String selectdata=objgenaral.getAttribute("value");
			System.out.println(selectdata+"is selectdata");
			
			if(test.equalsIgnoreCase(selectdata))
			{
				ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7,"capture data selected");
				ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8,"passed");
			}
			else
			{
				ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 7, "capturedata not selected");
				ExcelFunctions.writedataforsinglecell(exceladdress, sheetname, i, 8, "fail");
			}
			
		
			default:
				break;
			}
		}	
		}
}
