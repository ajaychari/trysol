package Pagefactoryobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	//define objects
	@FindBy(how = How.NAME,using ="firstname")
	WebElement fname;
	@FindBy(how =How.NAME,using="lastname")
	WebElement lname;
	@FindBy(how =How.NAME,using="reg_email__")
	WebElement email;
	//@FindBy(how = How.NAME,using="reg_email_confirmation__")
	//WebElement remail;
	@FindBy(how = How.ID,using="password_step_input")
	WebElement pass;
	@FindBy(id="day")
	WebElement day;
	@FindBy(id="month")
	WebElement month;
	@FindBy(id="year")
	WebElement year;
	@FindBy(how = How.XPATH,using="//input[@value='1']")
	WebElement female;
	@FindBy(how = How.XPATH,using="//input[@value='2']")
	WebElement male;
	@FindBy(how = How.XPATH,using="////input[@value='-1']")
	WebElement custom;
	@FindBy(how = How.NAME,using="websubmit")
	WebElement singup;
	WebDriver driver=null;
	
	public Registration(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterFirstName(String firstname) 
	{
		fname.sendKeys(firstname);
	}
	public void enterLastName(String lastname) 
	{
		lname.sendKeys(lastname);
	}
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	/*public void enterRemail(String reemail) 
	{
		remail.sendKeys(reemail);
	}*/
	public void enterPassword(String pasword) 
	{
		pass.sendKeys(pasword);
	}
	//create method for web element for day

	//select day
	public void selectday(String date)
		
	{
		Select dayselect=new Select(day);
		dayselect.selectByVisibleText(date);
	}
	//select month
	public void selectmonthbyvisibletext(String months)
	{
		Select monthselect=new Select(month);
		monthselect.selectByVisibleText(months);
		
	}
	//select year
	public void selectyearbyvisibletext(String years)
	{
		Select yearselect=new Select(year);
		yearselect.selectByVisibleText(years);
	}
	//select female
	public void female()
	{
		female.click();
	}
	//select male
	public void male()
	{
		male.click();
	}
	//select custom
	public void customgender()
	{
		custom.click();
	}
	//click on sign in button
	public void clickOnSignUp()
	{
		singup.click();
	}

		
	
}
