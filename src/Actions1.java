import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//define actions
		Actions acts= new Actions(driver);
		// identify username 
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
		//uname.sendKeys("ajahsjd");
		//perform operations
		acts.moveToElement(uname).sendKeys("ajaymeesaragandla").build().perform();
		//Actions act2=new Actions(driver);
		Thread.sleep(5000);
		//identify password
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		//perform operations
		acts.moveToElement(pwd).click()
		.sendKeys("@aajay99#2@")
		.build()
		.perform();
		Thread.sleep(1000);
		driver.close();
	}

}
