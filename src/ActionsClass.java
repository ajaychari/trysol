import java.awt.Desktop.Action;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.StaleElementReferenceException;
public class ActionsClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		/*open application
		driver.get("https://www.facebook.com/");
		//to identify the email text box
		WebElement Email=driver.findElement(By.xpath("//input[@type='text']"));
		Email.sendKeys("ajay9w9@gmail.com");*/
		//actions with link
		 //1.open app
		driver.get("https://www.espncricinfo.com/");
		WebElement Teams=driver.findElement(By.xpath("//a[@href='/team']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(Teams).build().perform();
		Thread.sleep(2000);
		WebElement team=driver.findElement(By.xpath("//a/span[contains(text(),'Oman')]"));
		mouse.moveToElement(team).click().build().perform();
		Thread.sleep(12000);
		String title=driver.getTitle();
		System.out.println(title);
		
		/*List<WebElement>teamcount=driver.findElements(By.xpath("//li[@title]"));
		 System.out.println(teamcount.size());  
		int teamname=driver.findElements(By.xpath("//li[@title]")).size();
		for(int i=1;i<=teamname;i++)
		{
			WebElement tname=driver.findElement(By.xpath("//li[@title]["+i+"]"));
			String teamsname=tname.getText();
			System.out.println(teamsname);
			mouse.moveToElement(tname).build().perform();*/
		
			driver.navigate().back();
			Thread.sleep(5000);
			WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
			//System.out.println(ele);
			ele.click();
			Thread.sleep(10000);
			mouse.moveToElement(Teams).build().perform();
			
			
		//}
		
		

	}

}
