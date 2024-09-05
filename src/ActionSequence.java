import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSequence {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser instance
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.facebook.com/");
		//
		Actions acts=new Actions(driver);
		//identify username
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
		//perform operations
		Action act=acts.moveToElement(uname).click()
				.keyDown(Keys.SHIFT)
				.sendKeys("ajaychari")
				.keyUp(Keys.SHIFT)
				.doubleClick()
				.keyDown(Keys.CONTROL)
				.sendKeys("c")
				.keyUp(Keys.CONTROL)
				.build();
		act.perform();
		Thread.sleep(3000);
		//identify pwd
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		//perform operations
		Action act1=acts.moveToElement(pwd).click()
				.keyDown(Keys.CONTROL)
				.sendKeys("v")
				.keyUp(Keys.CONTROL)
				.build();
		act1.perform();
				
		
		
		}

}
