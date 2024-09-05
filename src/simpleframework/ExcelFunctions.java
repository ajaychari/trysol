package simpleframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions {
	public static ArrayList<String> sheetStore(String filepath) throws IOException
	{
		ArrayList<String> sheetname=new ArrayList<>();
		//identify the file
		File file=new File(filepath);
		//identify the input file
		FileInputStream fileinput=new FileInputStream(file);
		//identify the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
		//sheet count
		int sheets=workbook.getNumberOfSheets();
		//capture sheet names and store into array list
		for(int i=0;i<sheets;i++) 
		{
			sheetname.add(workbook.getSheetName(i));
			
		}
		return sheetname;
		
		
		
			
	}
	
	
	
	
	
	//process 1.identify the file,2.identify the input file,identify the excel file ,identify the sheet count
	public static int sheetCount(String filepath) throws IOException
	{
		//identify the file
		File file=new File(filepath);
		//identify the input file
		FileInputStream fileinput=new FileInputStream(file);
		//identify the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
		//sheet count
		int sheets=workbook.getNumberOfSheets();
		return sheets;
		
			
	}
	//row count
	//process 1.identify the file ,identify the input stream,identify excel file 
	//identify file
	public static int rowCount(String filepaths,String sheetName) throws IOException {
		//identify file
		File file1=new File(filepaths);
		//identify file input 
		FileInputStream input=new FileInputStream(file1);
		//identify excel file
		XSSFWorkbook work=new XSSFWorkbook(input);
		//identify the sheet 
		Sheet sheetname=work.getSheet(sheetName);
		//identify rows in sheet
		int rowcount=sheetname.getLastRowNum();
		return rowcount;
	}
	
	
	
	//coloumn count
	//process 1.identify the file ,identify the iput file,identify the excel,
	//identify the sheet,identify the row,column count
	public static int colcount(String files,String sheets,int rownumber) throws IOException 
	{
		//identify file
		File file=new File(files);
		//identify fileinput
		FileInputStream colfile=new FileInputStream(file);
		//identify excel
		XSSFWorkbook colbook=new XSSFWorkbook(colfile);
		//identify sheet
		Sheet colsheet=colbook.getSheet(sheets);
		//identify rows and coloumn count
		int coloumn= colsheet.getRow(rownumber).getLastCellNum();
		
		return coloumn;
		
	}
	//read data
	//process 1.identify the file ,identify the input file,identify the excel,
	//identify the sheet,identify the row and coloum read data,close workbook, close file
	
	public static String readData (String files,String sheets,int rownum) throws IOException 
	{
				//identify file
				File file=new File(files);
				//identify fileinput
				FileInputStream colfile=new FileInputStream(file);
				//identify excel
				XSSFWorkbook colbook=new XSSFWorkbook(colfile);
				//identify sheet
				Sheet colsheet=colbook.getSheet(sheets);
				//identify rows and coloumn count
				int coloumn= colsheet.getRow(rownum).getLastCellNum();
				
				//read data 
				//single cell reading
				//for single cell
				
				//for identify single row
								
				/*for(int i=0;i<rownum;i++)
				{
					Row row=colsheet.getRow(i);
					for(int j=0;j<coloumn;j++)
					{
						Cell cell=row.
					}
				}*/
				
				return null;
				

		
	}
	//read single cell 
	// identify the file, identify the input file ,identify the excel file ,
	//identify the sheet ,identify the row and coloumn[single cell reading]
	// read data close work
	
	public static String readDataExcel(String files,String sheets,int row,int colnum) throws IOException 
	{
		
		//identify file
		File file=new File(files);
		//identify fileinput
		FileInputStream colfile=new FileInputStream(file);
		//identify excel
		XSSFWorkbook colbook=new XSSFWorkbook(colfile);
		//identify sheet
		Sheet colsheet=colbook.getSheet(sheets);
		//identify rows and coloumn
		String celldata=colsheet.getRow(row).getCell(colnum).getStringCellValue();
		//close workbook 
		colbook.close();
		//close file
		colfile.close();
		//return cell data
		return celldata;
	}
	
	//write data for single cell
		//identify the fil, identify the fileinput,identify the excel,identify the sheet,identify the row,identify the cell and enter data,close file,create write object,write in out file
		public static void writedataforsinglecell(String file, String Sheetpath,int rownumber, int columnnumber, String writedata) throws Exception
		{
			//identify the file
			File filename=new File(file);
			//identify the inputfile
			FileInputStream inputfile=new FileInputStream(filename);
			//indentify the excel file
			XSSFWorkbook workbookname=new XSSFWorkbook(inputfile);
			//identify the sheet
			Sheet sheetname=workbookname.getSheet(Sheetpath);
			
			//identify the row 
			Row row=sheetname.getRow(rownumber);
			//identify the cell
			Cell cell=row.getCell(columnnumber);
			//create cell
			if(cell==null) 
			{
				cell=row.createCell(columnnumber, CellType.STRING);
			}
			//enter data
			cell.setCellValue(writedata);
			inputfile.close();
			//create out object
			FileOutputStream output=new FileOutputStream(filename);
			//write data
			workbookname.write(output);
			output.close();
			
			
			
			
			
			
		}
	
	//read multiple cells
	//write data
	//write multiple coloum


}


