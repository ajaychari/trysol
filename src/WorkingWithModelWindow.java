import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithModelWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//driver instance
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//identify the create page and click
		WebElement window=driver.findElement(By.linkText("Create Page"));
		window.click();
		Thread.sleep(5000);
		//capture model window title
		String ModelTitle=driver.getWindowHandle();
		System.out.println(ModelTitle);
		//Switch to model window
		driver.switchTo().window(ModelTitle);
		//identify the login facebook and give details for user name,password and perform click
		WebElement uname=driver.findElement(By.xpath("//input[@type='email']"));
		uname.sendKeys("ajaashkahkdakDHK");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("ajay@4152");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		//switch to default window
		driver.switchTo().defaultContent();
		//Identify the email and give data and perform
		WebElement uname1=driver.findElement(By.xpath("//input[@type='text']"));
		uname1.sendKeys("ajaydjkahsjhdjhd");
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("jashjshja");
		Thread.sleep(3000);
		WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		
		driver.close();
		
		

		
		
		
	}

}
