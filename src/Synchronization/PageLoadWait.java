package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create  browser instance
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// click on craete page
		WebElement create=driver.findElement(By.linkText("Create Page"));
		create.click();
		//apply page load
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		// enter email and pwd
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("ajayudh");
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("jagdsjhkh");
		
	}

}
