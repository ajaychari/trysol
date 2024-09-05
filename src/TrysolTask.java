import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrysolTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///G:/levitica%20training/manual%20testing%20classes/table1.html");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		System.out.println(count);
		
		
		/*WebElement chbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		chbox.click();
		Thread.sleep(5000);
		
		WebElement parCh=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[5]/td[1]/input[@value='c4']"));
		parCh.click();*/
		int tablerowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println(tablerowcount);
		
		
		int coloumcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")).size();
		System.out.println(coloumcount);
		
		int row= driver.findElements(By.tagName("tr")).size();
		System.out.println(row);
		
		int col=driver.findElements(By.tagName("td")).size();
		System.out.println(col);
		
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
		Thread.sleep(1000);
		for(int i=1;i<=tablerowcount;i++)
		{
			int chbox1=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).size();
			System.out.println(+i+" row checkbox count "+chbox1);
			for(int j=1;j<=chbox1;j++)
			{
				WebElement deselect=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@value='c"+j+"']"));
				deselect.click();
				if(deselect.isSelected()==false)
				{
					System.out.println(+i+" row"+j+"checkbox is deseleted");
				}
				else
				{
					System.out.println(+i+" row"+j+"checkbox is seleted");
				}
			}
			
		}
		Thread.sleep(1000);
		

		for(int i=1;i<=tablerowcount;i++)
		{
			     //count check boxes in each row
				int checkboxcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).size();
				System.out.println(+i+" row checkbox count "+checkboxcount);
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
		
		//driver.close();
		
	}

	}
	
}
