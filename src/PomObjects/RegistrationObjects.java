package PomObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationObjects {
	//create browser instance
	WebDriver driver=null;
	//idenitify objects
	//1.firstname
	By ObjFname=By.xpath("//input[@name='firstname']");
	//2.lastname
	By ObjLname=By.xpath("//input[@name='lastname']");
	//3.email address
	By ObjEmail=By.xpath("//input[@name='reg_email__']");
	//4. re- enter email
	By ObjRemail=By.xpath("//input[@name='reg_email_confirmation__']");
	//4.password
	By ObjPass=By.id("password_step_input");
	//5.dateofbirth(day)
	By ObjDay=By.id("day");
	//6.date of birth(month)
	By ObjMonth=By.id("month");
	//7.date of birth(year)
	By ObjYear=By.id("year");
	//8.gender(female)
	By ObjFemale=By.xpath("//input[@value='1']");
	//9.gender(male)
	By ObjMale=By.xpath("//input[@value='2']");
	//10.gender(custom)
	By ObjCust=By.xpath("//input[@value='-1']");
	//11.signup button
	By ObjSignUp=By.name("websubmit");
	
	
	//define constructor
	public RegistrationObjects(WebDriver driver) 
	{
		this.driver=driver;
	}
	//create methods to each object
	public void firstName(String firstname) 
	{
		driver.findElement(ObjFname).sendKeys(firstname);
	}
	public void lastName(String lastname) 
	{
		driver.findElement(ObjLname).sendKeys(lastname);
	}
	public void emailAdd(String email)
	{
		driver.findElement(ObjEmail).sendKeys(email);
	}
	public void reMail(String mail) 
	{
		driver.findElement(ObjRemail).sendKeys(mail);
		
	}
	
	public void password(String password)
	{
		driver.findElement(ObjPass).sendKeys(password);
	}
	//create method for web element for day
	public WebElement dayObj() {
		WebElement daySelect=driver.findElement(ObjDay);
		return daySelect;
	}
	//select by visible text
	
	public void selectByVisibleText(String text) 
	{
		//select by visible text
		Select daySelect=new Select(dayObj());
		daySelect.selectByVisibleText(text);
	}
	// create web Element for month
	public WebElement monObj() {
		WebElement monSelect=driver.findElement(ObjMonth);
		return monSelect;
		
	}
	//select by visible text for month
	public void selectmonthnumberbyvalue(String mvalue)
	{
		//monthnumber convert into select
		Select mselect=new Select(monObj());
		mselect.selectByVisibleText(mvalue);
	}
	//create webElement for year
	public WebElement yearObj() {
		WebElement yearSelect=driver.findElement(ObjYear);
		return yearSelect;
		
	}
	//select by visible text for year
	public void selectYear(String year) {
		Select ySelect=new Select(yearObj());
		ySelect.selectByVisibleText(year);
		
		
	}
	public void femaleRadio() 
	{
		driver.findElement(ObjFemale).click();
		
	}
	public void maleRadio() 
	{
		driver.findElement(ObjMale).click();
		
	}
	public void customRadio()
	{
		driver.findElement(ObjCust).click();
	}
	public void sigup()
	{
		driver.findElement(ObjSignUp).click();
	}
	
	

}
