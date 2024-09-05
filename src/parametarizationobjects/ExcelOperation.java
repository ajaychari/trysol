package parametarizationobjects;

import java.io.IOException;
import java.util.ArrayList;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//excel file path
		String exceladdress="G:\\levitica training\\Testdata.xlsx";
		//sheetcount
		int sheet=Exceludf.sheetCount(exceladdress);
		System.out.println(sheet);
		
		//to get no of rows in sheet\
		String sheetname="registration";
		int row=Exceludf.rowCount(exceladdress, sheetname);
		System.out.println(row);
		// to get no of coloumn in sheet
		
		int coloumn=Exceludf.colcount(exceladdress, sheetname,1);
		System.out.println(coloumn);
		
		//read sheet names
		ArrayList<String> mySheets=Exceludf.sheetStore(exceladdress);
		System.out.println(mySheets.size());
		//display the sheet names
		for(int i=0;i<mySheets.size();i++)
		{
			System.out.println(mySheets.get(i));
			int rows=Exceludf.rowCount(exceladdress, mySheets.get(i));
			System.out.println(rows);
			//to display each row coloum count
			for(int j=0;j<rows;j++)
			{
				System.out.println(Exceludf.colcount(exceladdress, mySheets.get(i), j));
			}
		}
	

	}

}
