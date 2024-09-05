package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //define exciplict wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("akakj");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("kajdk");
		WebElement ok=driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@type='submit']")));
		ok.click();
		
		
	}

}
