import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// create browser instance
		WebDriver driver=new ChromeDriver();
		// open application
		driver.get("https://www.facebook.com/");
		
		// identify the link text
		WebElement ele=driver.findElement(By.linkText("Meta Pay"));
		ele.click();
		Thread.sleep(3000);
		//identify another link text
		WebElement ele1=driver.findElement(By.xpath("//a[@Title='Discover Meta']"));
		ele1.click();
		Thread.sleep(4000);
		//identify another link
		WebElement insta=driver.findElement(By.linkText("Instagram"));
		insta.click();
		Thread.sleep(5000);
		//identify another link
		WebElement ele3=driver.findElement(By.linkText("Imagine with Meta AI"));
		ele3.click();
		Thread.sleep(5000);
		// count of tabs
		//step1: all tabs store in arraylist
		ArrayList<String> TabCount=new ArrayList<String>(driver.getWindowHandles());
		//step2: print tabs count
		System.out.println(TabCount.size());
		
		//display all tab names
		for(int i=0;i<TabCount.size();i++)
		{
			driver.switchTo().window(TabCount.get(i));
			Thread.sleep(5000);
			String bTitle = driver.getTitle();
			System.out.println(bTitle);
		
		//verify instagram title
		//String excepted="Instagram";
		if(bTitle.equalsIgnoreCase("Instagram")==true) {
			//System.out.println("instagram title is correctly displayed");
			// Identify the boxes (username  password in instagram tab)
			WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
			uname.sendKeys("missile_ajay_08");
			WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
			pwd.sendKeys("ajaycha==ri");
			WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			
			
			
		}
		else if(bTitle.equalsIgnoreCase("Facebook – log in or sign up")==true)
		{
			//System.out.println("instagram title is not displayed correctly");
			WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
			user.sendKeys("9985547909");
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("ajaychariii");
			WebElement ok=driver.findElement(By.xpath("//button[@type='submit']"));
			ok.click();
		}
		}
		
		
		
	}

}
