package PomObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
	WebDriver driver=null;
	By ObjEmail=By.xpath("//input[@id='identify_email']");
	By ObjCancel=By.linkText("Cancel");
	By ObjSearch=By.xpath("//button[@id='did_submit']");
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void emailEntername(String email) 
	{
		driver.findElement(ObjEmail).sendKeys(email);
	}
	public void clickOnSearch() 
	{
		driver.findElement(ObjSearch).click();
	}
	public void clickOnCancel() 
	{
		driver.findElement(ObjCancel).click();
		
	}
}
