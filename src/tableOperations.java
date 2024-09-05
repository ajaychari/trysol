import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebElement ele=driver.findElement(By.linkText("Create Account"));
		ele.click();
		Thread.sleep(5000);
		//table count
		int TableCount=driver.findElements(By.xpath("//table")).size();
		System.out.println(TableCount);
		//table count using tag name
		int TbCount=driver.findElements(By.tagName("table")).size();
		System.out.println(TbCount);
		//row count
		
		int  RowCount=driver.findElements(By.xpath("//tr")).size();
		System.out.println(RowCount);
		//rowcount using tag name
		int Rcount=driver.findElements(By.tagName("tr")).size();
		System.out.println(Rcount);
		//coloum count
		int ColCount=driver.findElements(By.xpath("//td")).size();
		System.out.println(ColCount);
		// col count using tag name
		int Col=driver.findElements(By.tagName("td")).size();
		System.out.println(Col);
		//specific table row count
		int specificRcount=driver.findElements(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr")).size();
		System.out.println(specificRcount);
		//specific table col count
		int specificColCount=driver.findElements(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td")).size();
		System.out.println(specificColCount);
		//capture specific cell data
		WebElement cell=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[5]"));
		String expected="Enter your first name & last name Eg. Sameer Bhagwat";
		String actual=cell.getText();
		System.out.println(actual);
		//compare expected and actual
		if(expected.equalsIgnoreCase(actual)==true)
		{
			System.out.println("expected text is same as actual");
		}
		else
		{
			System.out.println("expected text is not same as actual");
		}
		//enter data
		WebElement name=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("ajaychari");
		
		//count off all rows
		for(int i=1;i<=specificRcount;i++)
		{
			int rowbasedcolcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td")).size();
			System.out.println("for "+i+" row the columns are "+rowbasedcolcount);

		}
		//capture the all cells data
		for(int i=1;i<=specificRcount;i++)//for loop(for row)
		{
			//coloumn count on rowbased
			int colcount=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td")).size();
			// for loop (for coloum)
			for(int j=1;j<=colcount;j++)
			{
				//identify the genral cell
				WebElement gCell=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr["+i+"]/td["+j+"]"));
				//capture data
				String str=gCell.getText();
				System.out.println("for "+i+" th row columns are "+str);
			}
		}
	}

}
