package PomObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonObjects {

	WebDriver driver=null;
	
	By Objtext= By.id("twotabsearchtextbox");
	 public AmazonObjects(WebDriver driver)
	 {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	 }
	 public void enterdata(String testData) 
	 {
		driver.findElement(Objtext).sendKeys(testData); 
		
	 }
	 public void dataTestScript(String testData) 
	 {
		 enterdata(testData);
	 }
	
}
	 
