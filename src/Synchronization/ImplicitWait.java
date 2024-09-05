package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create driver instance
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//identify create account 
		WebElement Create=driver.findElement(By.linkText("Create new account"));
		Create.click();
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("ajay");
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("majhdjhi");
		
			

	}

}
