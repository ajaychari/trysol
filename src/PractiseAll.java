import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseAll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// open the selenium test application
		driver.get("file:///G:/levitica%20training/manual%20testing%20classes/table1.html");
		//count all check boxes
		int checkCount=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(checkCount);
		//identify particular checkbox and perform count
		WebElement check=driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		check.click();
		WebElement Check2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[6]/td[1]/input[@value='c9']"));
		Check2.click();
	
		
		
		// table count
		int tablecount=driver.findElements(By.xpath("//table")).size();
		System.out.println(tablecount);
		// table count using tagname
		int tablcoutn=driver.findElements(By.tagName("table")).size();
		System.out.println(tablcoutn);
		
		//row count
		int rowcount=driver.findElements(By.xpath("//tr")).size();
		System.out.println(rowcount);
		//row copunt using tagname
		int rcount=driver.findElements(By.tagName("tr")).size();
		System.out.println(rcount);
		// column count
		int columncount=driver.findElements(By.xpath("//td")).size();
		System.out.println(columncount);
		//column count using tagname
		int colcount=driver.findElements(By.tagName("td")).size();
		System.out.println(colcount);
		//specific table row count
		int tablerowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println(tablerowcount);
		//specific table column count
		int tablecolumncount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")).size();
		System.out.println(tablecolumncount);
		///capture specific cell data
		WebElement specificcelldata=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[2]"));
		
		// get text data
		String gettext=specificcelldata.getText();
		System.out.println("get text is "+gettext);
		//capture particular row in table
		WebElement sptbrdata=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
		String rowdata=sptbrdata.getText();
		System.out.println("row data is "+rowdata);
		//capture all cells data
		for(int i=1;i<=tablerowcount;i++)//for loop(for row)
		{
			//coloumn count on rowbased
			int clcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td")).size();
			// for loop (for coloum)
			for(int j=1;j<=clcount;j++)
			{
				//identify the general cell
				WebElement gCell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				//capture data
				String str=gCell.getText();
				System.out.println(+i+" row "+j+" coloum the cell data is "+str);
			}
		}
		// to count  row based checkbox and select all check boxes
				for(int i=1;i<=tablerowcount;i++)
				{
					     //count checkboxes in each row
						int checkboxcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).size();
						System.out.println(+i+" row checkbox count "+checkboxcount);
						//to identify all check boxes in table and select all check boxes
						for(int j=1;j<=checkboxcount; j++ )
						{
							WebElement che=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@value='c"+j+"']"));
							che.click();
							//verify that each check box is selected or not
							if(che.isSelected()==true)
							{
								System.out.println(+i+" row "+j+" checkbox is selected");
							}
							else
							{
								System.out.println(+i+" row "+j+" checkbox is not selected");
							}
							
						}
												
				}
				//apply deselect operation on selected check boxes
				for(int i=1;i<=tablerowcount;i++)
				{
						//count the all selected check boxes
						int checkboxcount1=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).size();
						//System.out.println(checkboxcount1);
						//to identify all check boxes in table and de select all check boxes
						for(int j=1;j<=checkboxcount1; j++ )
						{
							WebElement deche=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@value='c"+j+"']"));
							deche.click();	
							if(deche.isSelected()==false)
							{
								System.out.println(+i+" row"+j+"checkbox is deseleted");
							}
							else
							{
								System.out.println(+i+" row"+j+"checkbox is selected");
							}
						}
											
				}
				//driver.close();
	}

}
