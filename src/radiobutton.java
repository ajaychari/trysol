import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https:\\\\www.facebook.com");
		WebElement  createaccount=driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		createaccount.click();
		Thread.sleep(5000);
		int rdbCount=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(rdbCount);
		//identify the specific one
		WebElement ele=driver.findElement(By.xpath("//input[@value='2']"));
		//ele.click();
		
		//displayed or enabled
		if(ele.isDisplayed()==true) {
			System.out.println("radio button is displayed");

		}
		else
		{
			System.out.println("radio button is not displayed");
		}
		if(ele.isEnabled()==true) {
			System.out.println("radio button is enabled");
		}
		else
		{
			System.out.println("radio button is not enabled");
		}
		//verify default status
		if(ele.isSelected()==true) {
			System.out.println("male radio button is default selected");
		}
		else
		{
			System.out.println("not selected default");
		}
		//select radio button
		ele.click();
		//verify select status
		if(ele.isSelected()==true) {
			System.out.println("male radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
