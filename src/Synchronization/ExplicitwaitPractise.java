package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.linkText("Create new account"));
		ele.click();
		//webDriverwait
		WebDriverWait waitforweb=new WebDriverWait(driver,Duration.ofSeconds(30));
		waitforweb.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstname"))));
		waitforweb.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		//identify fnmae
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("ajay");

	}

}
