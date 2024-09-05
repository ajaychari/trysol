import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//to create browser instance
		WebDriver driver=new ChromeDriver();
		//open the app
		driver.get("https://www.facebook.com/");
		
		//count all links
		int LinksCount=driver.findElements(By.xpath("//a")).size();
		System.out.println(LinksCount);
		//linkscount using tag name
		int LinkCount=driver.findElements(By.tagName("a")).size();
		System.out.println(LinkCount);
		
		//all links store in list
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		
		//display all link name and url
		for(int i=0;i<LinksCount;i++)
		{
			//capture the link name
			String LinkName=link.get(i).getText();
			//print all the link
			System.out.println(LinkName+"    ------->"+i);
			//capture link url
			String LinkURL=link.get(i).getAttribute("href");
			System.out.println(LinkURL);
			
			
		}
		//capture home page title
		String HomeTitle=driver.getTitle();
		System.out.println(HomeTitle);
		
		
		//identify the specific (forgotpassword)
		WebElement ForgotPassword=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		ForgotPassword.click();
		
				
		//displayed and enabled
		//click on specific link
		//verify title
		if(HomeTitle.equalsIgnoreCase(driver.getTitle())==false) {
			System.out.println("forgotpassword displayed");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			
		}
		else
		{
			System.out.println("Still in home page");
		}
		//back
		
		//verify title
		if(HomeTitle.equalsIgnoreCase(driver.getTitle())==true) {
			System.out.println("IN HOME PAGE");
		}
		else
		{
			System.out.println("not in home page");
		}
		//identify the another link text by using linktext
		WebElement element=driver.findElement(By.linkText("Help"));
		element.click();
		//verify the title
		if(HomeTitle.equalsIgnoreCase(driver.getTitle())==false) {
			System.out.println("help is displyed");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("help link not displayed");
		}
		//again click on another title
		//verify title
		if(HomeTitle.equalsIgnoreCase(driver.getTitle())==true) {
			System.out.println("In Home page");
		}
		else {
			System.out.println("Not In HomePage");
		}
		//display all link names
	}

}
