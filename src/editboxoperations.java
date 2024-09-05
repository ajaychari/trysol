import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editboxoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create driver instance
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open app
		driver.get("https:\\www.facebook.com");
		//identify create account and click
		WebElement  createaccount=driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		createaccount.click();
		//input categoery count.
		int inputEle=driver.findElements(By.xpath("//input")).size();
		System.out.println(inputEle);
		//text box count/ email count/password count
		//identify the specific edit box
		
		//displayed or not
		//enabled or not
		//enter data
		//capture data
		driver.close();

	}

}
